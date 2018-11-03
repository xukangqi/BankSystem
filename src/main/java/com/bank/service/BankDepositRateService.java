package com.bank.service;

import com.bank.pojo.BankDepositRate;
import com.bank.utils.BankResult;

public interface BankDepositRateService {

    BankResult insert(BankDepositRate bankDepositRate);

    BankResult update(BankDepositRate bankDepositRate);

    BankResult getAllRate();
}
