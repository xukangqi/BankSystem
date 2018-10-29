package com.bank.controller;


import com.bank.service.RemitService;
import com.bank.utils.BankResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user/remit")
public class RemitController {
    @Autowired
    private RemitService remitService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public BankResult createRemit(@RequestParam(value = "remit_out_account")String remitOutAccount,
                                  @RequestParam(value = "remit_in_account")String remitInAccount,
                                  @RequestParam(value = "amount")double amount) {
        BankResult bankResult = remitService.createRemit(remitOutAccount, remitInAccount, amount);
        return bankResult;
    }

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    @ResponseBody
    public BankResult getRemit(@RequestParam(value = "remit_in_account")String remitInAccount,
                               @RequestParam(value = "remit_id")String remitId) {
        BankResult bankResult = remitService.getRemit(remitInAccount, remitId);
        return bankResult;
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    @ResponseBody
    public BankResult getRemitLogs() {
        BankResult bankResult = remitService.getRemitLogs();
        return bankResult;
    }
}
