package com.bank.service;

import com.bank.pojo.BankWithdraw;
import com.bank.utils.BankResult;

public interface BankWithdrawService {

    BankResult insert(BankWithdraw bankWithdraw);

    BankResult getBankWithdrawByAccount(String account);
}
