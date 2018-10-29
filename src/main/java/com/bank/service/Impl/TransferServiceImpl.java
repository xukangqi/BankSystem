package com.bank.service.Impl;

import com.bank.service.TransferService;
import com.bank.utils.BankResult;
import org.springframework.stereotype.Service;

@Service
public class TransferServiceImpl implements TransferService {
    @Override
    public BankResult createTransferTx() {
        return BankResult.ok();
    }
}
