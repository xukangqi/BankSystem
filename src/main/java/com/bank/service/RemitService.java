package com.bank.service;

import com.bank.utils.BankResult;

public interface RemitService {
    BankResult createRemit(String remitOutAccount, String remitInAccount, double amount);
    BankResult getRemit(String remitInAccount, String remitId);
    BankResult getRemitLogs();
}
