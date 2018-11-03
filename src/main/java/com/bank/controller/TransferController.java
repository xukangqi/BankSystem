package com.bank.controller;

import com.bank.service.TransferService;
import com.bank.utils.BankResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user/transfer")
public class TransferController {
    @Autowired
    private TransferService transferService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public BankResult createTransfer(@RequestParam(value = "name")String name,
                                     @RequestParam(value = "phone")String phone,
                                     @RequestParam(value = "transfer_out_account")String transferOutAccount,
                                     @RequestParam(value = "transfer_in_account")String transferInAccount,
                                     @RequestParam(value = "password")String password,
                                     @RequestParam(value = "amount")double amount) {
        BankResult bankResult = transferService.createTransfer(name, phone, transferOutAccount, transferInAccount, password, amount);

        return bankResult;
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    @ResponseBody
    public BankResult getTransferLogs() {
        BankResult bankResult = transferService.getTransferLogs();

        return bankResult;
    }
}
