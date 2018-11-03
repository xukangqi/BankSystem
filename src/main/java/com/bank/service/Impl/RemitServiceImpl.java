package com.bank.service.Impl;

import com.bank.mapper.BankAccountMapper;
import com.bank.mapper.BankCustomerMapper;
import com.bank.mapper.BankRemitLogMapper;
import com.bank.pojo.*;
import com.bank.service.RemitService;
import com.bank.utils.BankResult;
import com.bank.utils.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemitServiceImpl implements RemitService {
    @Autowired
    private BankRemitLogMapper bankRemitLogMapper;
    @Autowired
    private BankAccountMapper bankAccountMapper;
    @Autowired
    private BankCustomerMapper bankCustomerMapper;

    private long datacenterId = 4L;  //数据中心
    private long machineId ;     //机器标识

    @Override
    public BankResult createRemit(String name, String phone, String remitOutAccount, String remitInAccount, String password, double amount) {
        machineId = 1L;

        BankAccount outAccount = bankAccountMapper.selectByPrimaryKey(remitOutAccount);
        BankCustomer outAccountCustomer = bankCustomerMapper.selectByPrimaryKey(outAccount.getCustId());
        BankAccount inAccount = bankAccountMapper.selectByPrimaryKey(remitInAccount);

        if (!outAccountCustomer.getCustName().equals(name))
            return BankResult.build(200, "Request Failed", "Wrong name!");

        if (!outAccountCustomer.getPhone().equals(phone))
            return BankResult.build(200, "Request Failed", "Wrong phone!");

        if (outAccount == null)
            return BankResult.build(200, "Request Failed", "Remit out account not exist!");

        if (!outAccount.getPassword().equals(password))
            return BankResult.build(200, "Request Failed", "Wrong password!");

        if (inAccount == null)
            return BankResult.build(200, "Request Failed", "Remit in account not exist!");

        if (outAccount.getBalances() < amount)
            return BankResult.build(200, "Request Failed", "Insufficient balance in remit out account!");

        SnowFlake snowFlake = new SnowFlake(datacenterId, machineId);
        long remitId = snowFlake.nextId();

        BankRemitLog bankRemitLog = new BankRemitLog();

        bankRemitLog.setRemitId(String.valueOf(remitId));
        bankRemitLog.setRemitOutAccount(remitOutAccount);
        bankRemitLog.setRemitInAccount(remitInAccount);
        bankRemitLog.setAmount(amount);

        outAccount.setBalances(outAccount.getBalances() - amount);
        bankAccountMapper.updateByPrimaryKey(outAccount);
        bankRemitLog.setRemitGenerateDate(String.valueOf(System.currentTimeMillis()));
        bankRemitLog.setRemitArriveDate(String.valueOf("Unpaid"));

        bankRemitLogMapper.insert(bankRemitLog);

        return BankResult.ok(bankRemitLog.getRemitId());
    }

    @Override
    public BankResult getRemit(String remitInAccount, String remitId) {
        BankAccount inAccount = bankAccountMapper.selectByPrimaryKey(remitInAccount);
        BankRemitLog bankRemitLog = bankRemitLogMapper.selectByPrimaryKey(remitId);
        if (bankRemitLog == null) return BankResult.build(200, "Request Failed", "Remit not exist!");

        if (!bankRemitLog.getRemitInAccount().equals(remitInAccount))
            return BankResult.build(200, "Request Failed", "Account not consistent with the remit!");

        if (!bankRemitLog.getRemitArriveDate().equals("Unpaid"))
            return BankResult.build(200, "Request Failed", "Remit has already been paid!");

        bankRemitLog.setRemitArriveDate(String.valueOf(System.currentTimeMillis()));
        bankRemitLogMapper.updateByPrimaryKey(bankRemitLog);

        inAccount.setBalances(inAccount.getBalances() + bankRemitLog.getAmount());
        bankAccountMapper.updateByPrimaryKey(inAccount);

        return BankResult.ok(remitId);
    }

    @Override
    public BankResult getRemitLogs() {
        BankRemitLogExample bankRemitLogExample = new BankRemitLogExample();
        BankRemitLogExample.Criteria criteria = bankRemitLogExample.createCriteria();
        criteria.andRemitIdIsNotNull();
        List<BankRemitLog> bankRemitLogsList = bankRemitLogMapper.selectByExample(bankRemitLogExample);

        return BankResult.ok(bankRemitLogsList);
    }


}
