package com.bank.service.Impl;

import com.bank.mapper.BankAccountMapper;
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

    private long datacenterId = 4L;  //数据中心
    private long machineId ;     //机器标识

    @Override
    public BankResult createRemit(String remitOutAccount, String remitInAccount, double amount) {
        machineId = 1L;

        BankAccount outAccount = bankAccountMapper.selectByPrimaryKey(remitOutAccount);
        BankAccount inAccount = bankAccountMapper.selectByPrimaryKey(remitInAccount);
        if (outAccount == null)
            return BankResult.build(200, "Request Failed", "Remit out account not exist!");
        if (inAccount == null)
            return BankResult.build(200, "Request Failed", "Remit in account not exist!");

        if (outAccount.getBalances() < amount)
            return BankResult.build(200, "Request Failed", "Insufficient balance in Remit out account!");

        SnowFlake snowFlake = new SnowFlake(datacenterId, machineId);
        long remitId = snowFlake.nextId();

        BankRemitLog bankRemitLog = new BankRemitLog();

        bankRemitLog.setRemitId(remitId);
        bankRemitLog.setRemitOutAccount(remitOutAccount);
        bankRemitLog.setRemitInAccount(remitInAccount);
        bankRemitLog.setAmount(amount);

        outAccount.setBalances(outAccount.getBalances() - amount);
        bankAccountMapper.updateByPrimaryKey(outAccount);
        bankRemitLog.setRemitGenerateDate(String.valueOf(System.currentTimeMillis()));

        bankRemitLogMapper.insert(bankRemitLog);

        return BankResult.ok(bankRemitLog.getRemitId());
    }

    @Override
    public BankResult getRemit(String remitInAccount, String remitId) {
        // TODO:等修改了BankRemitLog中的数据库字段后再编写

        return BankResult.ok();
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
