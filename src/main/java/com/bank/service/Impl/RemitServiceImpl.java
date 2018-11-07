package com.bank.service.Impl;

import com.bank.mapper.BankAccountMapper;
import com.bank.mapper.BankCustomerMapper;
import com.bank.mapper.BankRemitLogMapper;
import com.bank.pojo.*;
import com.bank.service.RemitService;
import com.bank.utils.BankResult;
import com.bank.utils.MD5;
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

        String pw = MD5.string2MD5(password);

        if (!outAccountCustomer.getCustName().equals(name))
            return BankResult.build(400, "用户姓名不匹配！", "");

        if (!outAccountCustomer.getPhone().equals(phone))
            return BankResult.build(400, "用户电话不匹配！", "");

        if (outAccount == null)
            return BankResult.build(400, "汇款账户不存在！", "");

        if (!outAccount.getPassword().equals(pw))
            return BankResult.build(400, "密码错误！", "");

        if (inAccount == null)
            return BankResult.build(400, "提款账户不存在！", "");

        if (outAccount.getBalances() < amount)
            return BankResult.build(400, "汇款账户余额不足！", "");

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
        if (bankRemitLog == null) return BankResult.build(400, "汇票不存在！", "");

        if (!bankRemitLog.getRemitInAccount().equals(remitInAccount))
            return BankResult.build(400, "提款账户不匹配！", "");

        if (!bankRemitLog.getRemitArriveDate().equals("Unpaid"))
            return BankResult.build(400, "汇款已被提取！", "");

        bankRemitLog.setRemitArriveDate(String.valueOf(System.currentTimeMillis()));
        bankRemitLogMapper.updateByPrimaryKey(bankRemitLog);

        inAccount.setBalances(inAccount.getBalances() + bankRemitLog.getAmount());
        bankAccountMapper.updateByPrimaryKey(inAccount);

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

    @Override
    public BankResult getOneRemitLog(String remitId) {
        BankRemitLog bankRemitLog = bankRemitLogMapper.selectByPrimaryKey(remitId);
        return BankResult.ok(bankRemitLog);
    }

}
