package com.bank.controller;

import com.bank.pojo.BankDepositRate;
import com.bank.service.BankDepositRateService;
import com.bank.utils.BankResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "/rate")
@Controller
public class BankDepositRateController {

    @Autowired
    private BankDepositRateService bankDepositRateService;

    @RequestMapping(value = "/insert")
    @ResponseBody
    public BankResult insert(BankDepositRate bankDepositRate){
        return bankDepositRateService.insert(bankDepositRate);
    }

    @RequestMapping(value = "/update")
    @ResponseBody
    public BankResult update(BankDepositRate bankDepositRate){
        return bankDepositRateService.update(bankDepositRate);
    }

    @RequestMapping(value = "/getRate")
    @ResponseBody
    public BankResult getAllRate(){
        return bankDepositRateService.getAllRate();
    }

}
