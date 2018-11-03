package com.bank.service.Impl;


import com.bank.mapper.BankAccountMapper;
import com.bank.mapper.BankWithdrawMapper;
import com.bank.pojo.BankAccount;
import com.bank.pojo.BankAccountExample;
import com.bank.pojo.BankWithdraw;
import com.bank.pojo.BankWithdrawExample;
import com.bank.service.BankWithdrawService;
import com.bank.utils.BankResult;
import com.bank.utils.MD5;
import com.bank.utils.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankWithdrawServiceImpl implements BankWithdrawService {

    private static SnowFlake snowFlake;

    @Autowired
    private BankWithdrawMapper bankWithdrawMapper;

    @Autowired
    private BankAccountMapper bankAccountMapper;

    @Override
    public BankResult insert(BankWithdraw bankWithdraw, String password) {
        if (bankWithdraw == null || password == null) {
            return BankResult.build(400, "参数错误");
        }

        if (snowFlake == null) {
            snowFlake = new SnowFlake(2, 1);
        }

        BankAccountExample bankAccountExample = new BankAccountExample();
        bankAccountExample.createCriteria().andAccountEqualTo(bankWithdraw.getAccount());
        List<BankAccount> bankAccounts = bankAccountMapper.selectByExample(bankAccountExample);
        if (bankAccounts == null || bankAccounts.size() > 1)
            return BankResult.build(400, "参数错误");
        BankAccount bankAccount = bankAccounts.get(0);
        if(!bankAccount.getPassword().equals(MD5.string2MD5(password))){
            return BankResult.build(400, "密码错误");
        }
        double balances = bankAccount.getBalances();
        double blockedBalances = bankAccount.getBlockedBalances();
        if (balances - blockedBalances < bankWithdraw.getWithdrawMoney())
            return BankResult.build(400, "余额不足");
        balances -= bankWithdraw.getWithdrawMoney();
        bankAccount.setBalances(balances);
        bankAccountMapper.updateByPrimaryKeySelective(bankAccount);
        bankWithdraw.setCustId(bankAccount.getCustId());
        bankWithdraw.setWithdrawDate(Long.toString(System.currentTimeMillis()));
        bankWithdraw.setArriveTime(Long.toString(System.currentTimeMillis() + 2000));
        bankWithdraw.setWithdrawId(Long.toString(snowFlake.nextId()));
        bankWithdrawMapper.insert(bankWithdraw);
        return BankResult.build(200, "取款成功");
    }

    @Override
    public BankResult getBankWithdrawByAccount(String account) {
        if (account == null || account.equals("")) {
            return BankResult.build(400, "参数错误");
        }
        BankWithdrawExample bankWithdrawExample = new BankWithdrawExample();
        bankWithdrawExample.createCriteria().andAccountEqualTo(account);
        bankWithdrawExample.setOrderByClause("withdraw_id desc");
        List<BankWithdraw> bankWithdraws = bankWithdrawMapper.selectByExample(bankWithdrawExample);
        return new BankResult(200, "查询成功", bankWithdraws);
    }
}
