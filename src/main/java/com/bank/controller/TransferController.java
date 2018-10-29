package com.bank.controller;

import com.bank.service.TransferService;
import com.bank.utils.BankResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user/transfer")
public class TransferController {
    @Autowired
    private TransferService transferService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public BankResult createTransferTx() {
        BankResult bankResult = transferService.createTransferTx();

        return bankResult;
    }
}
