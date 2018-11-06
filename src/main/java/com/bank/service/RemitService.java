package com.bank.service;

import com.bank.utils.BankResult;

public interface RemitService {
    BankResult createRemit(String name, String phone, String remitOutAccount, String remitInAccount, String password, double amount);
    BankResult getRemit(String remitInAccount, String remitId);
    BankResult getRemitLogs();
    BankResult getOneRemitLog(String remitId);
}
