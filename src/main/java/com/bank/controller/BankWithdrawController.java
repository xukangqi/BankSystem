package com.bank.controller;


import com.bank.pojo.BankWithdraw;
import com.bank.service.BankWithdrawService;
import com.bank.utils.BankResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/withdraw")
@Controller
public class BankWithdrawController {

    @Autowired
    private BankWithdrawService bankWithdrawService;

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public BankResult insert(@RequestParam("password")String password, BankWithdraw bankWithdraw){
        return bankWithdrawService.insert(bankWithdraw, password);
    }

    @RequestMapping(value = "/{account}")
    @ResponseBody
    public BankResult getBankDepositFromAccount(@PathVariable("account") String account){
        return bankWithdrawService.getBankWithdrawByAccount(account);
    }
}
