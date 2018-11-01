package com.bank.service.Impl;


import com.bank.mapper.BankWithdrawMapper;
import com.bank.pojo.BankWithdraw;
import com.bank.pojo.BankWithdrawExample;
import com.bank.service.BankWithdrawService;
import com.bank.utils.BankResult;
import com.bank.utils.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankWithdrawServiceImpl implements BankWithdrawService {

    private static SnowFlake snowFlake;

    @Autowired
    private BankWithdrawMapper bankWithdrawMapper;

    @Override
    public BankResult insert(BankWithdraw bankWithdraw) {
        if (bankWithdraw == null) {
            return BankResult.build(400, "参数错误");
        }

        if (snowFlake == null) {
            snowFlake = new SnowFlake(2, 1);
        }

        bankWithdraw.setWithdrawId(snowFlake.nextId());
        bankWithdrawMapper.insert(bankWithdraw);
        return BankResult.build(200, "新增成功");
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
