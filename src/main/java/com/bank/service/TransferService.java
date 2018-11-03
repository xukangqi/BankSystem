package com.bank.service;

import com.bank.utils.BankResult;

public interface TransferService {
    BankResult createTransfer(String name, String phone, String transferOutAccount, String transferInAccount, String password, double amount);
    BankResult getTransferLogs();
    BankResult getOneTransferLog(String transferId);
}
