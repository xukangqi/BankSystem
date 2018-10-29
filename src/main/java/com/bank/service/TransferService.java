package com.bank.service;

import com.bank.utils.BankResult;

public interface TransferService {
    BankResult createTransfer(String transferOutAccount, String transferInAccount, double amount);
    BankResult getTransferLogs();
}
