package com.bank.service;

import com.bank.utils.BankResult;

public interface TransferService {
    BankResult createTransfer(String transferOutAccount, String transferInAccount, String password, double amount);
    BankResult getTransferLogs();
}
