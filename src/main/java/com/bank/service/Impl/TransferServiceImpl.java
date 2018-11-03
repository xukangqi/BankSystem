package com.bank.service.Impl;

import com.bank.mapper.BankAccountMapper;
import com.bank.mapper.BankTransferLogMapper;
import com.bank.pojo.BankAccount;
import com.bank.pojo.BankTransferLog;
import com.bank.pojo.BankTransferLogExample;
import com.bank.service.TransferService;
import com.bank.utils.BankResult;
import com.bank.utils.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferServiceImpl implements TransferService {
    @Autowired
    private BankTransferLogMapper bankTransferLogMapper;
    @Autowired
    private BankAccountMapper bankAccountMapper;

    private long datacenterId = 3L;  //数据中心
    private long machineId ;     //机器标识

    @Override
    public BankResult createTransfer(String transferOutAccount, String transferInAccount, String password, double amount) {
        machineId = 1L;


        BankAccount outAccount = bankAccountMapper.selectByPrimaryKey(transferOutAccount);
        BankAccount inAccount = bankAccountMapper.selectByPrimaryKey(transferInAccount);
        if (outAccount == null)
            return BankResult.build(200, "Request Failed", "Transfer out account not exist!");

        if (!outAccount.getPassword().equals(password)) return BankResult.build(200, "Request Failed", "Wrong password!");

        if (inAccount == null)
            return BankResult.build(200, "Request Failed", "Transfer in account not exist!");

        if (outAccount.getBalances() < amount)
            return BankResult.build(200, "Request Failed", "Insufficient balance in transfer out account!");

        SnowFlake snowFlake = new SnowFlake(datacenterId, machineId);
        long transferId = snowFlake.nextId();

        BankTransferLog bankTransferLog = new BankTransferLog();

        bankTransferLog.setTransferId(transferId);
        bankTransferLog.setTransferOutAccount(transferOutAccount);
        bankTransferLog.setTransferInAccount(transferInAccount);
        bankTransferLog.setAmount(amount);

        outAccount.setBalances(outAccount.getBalances() - amount);
        bankAccountMapper.updateByPrimaryKey(outAccount);
        bankTransferLog.setTransferDate(String.valueOf(System.currentTimeMillis()));

        inAccount.setBalances(inAccount.getBalances() + amount);
        bankAccountMapper.updateByPrimaryKey(inAccount);
        bankTransferLog.setReceiveDate(String.valueOf(System.currentTimeMillis()));

        bankTransferLogMapper.insert(bankTransferLog);

        return BankResult.ok(bankTransferLog.getTransferId());
    }

    @Override
    public BankResult getTransferLogs() {
        BankTransferLogExample bankTransferLogExample = new BankTransferLogExample();
        BankTransferLogExample.Criteria criteria = bankTransferLogExample.createCriteria();
        criteria.andTransferIdIsNotNull();
        List<BankTransferLog> bankTransferLogList = bankTransferLogMapper.selectByExample(bankTransferLogExample);

        return BankResult.ok(bankTransferLogList);
    }
}
