package com.bank.controller;

import com.bank.pojo.BankDeposit;
import com.bank.service.BankDepositService;
import com.bank.utils.BankResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @program: BankSystem
 * @description:
 * @author: i_know_i
 * @create: 2018-10-18 20:15
 **/
@Controller
@RequestMapping(value = "/deposit")
public class BankDepositController {

    @Autowired
    private BankDepositService bankDepositService;

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public BankResult insert(BankDeposit bankDeposit, @RequestParam("password")String password){
//        System.out.println(bankDeposit);
        return bankDepositService.insert(bankDeposit, password);
    }

    @RequestMapping(value = "/{account}")
    @ResponseBody
    public BankResult getBankDepositFromAccount(@PathVariable("account") String account){
        return bankDepositService.getBankDepositFromAccount(account);
    }

   /* @RequestMapping(value = "/update.do")
    @ResponseBody
    public BankResult update(BankDeposit bankDeposit){
        return bankDepositService.update(bankDeposit);
    }

    @RequestMapping(value = "/delete.do")
    @ResponseBody
    public BankResult delete(HttpServletRequest request){
        String idString = request.getParameter("depositIds");
        return bankDepositService.update(bankDeposit);
    }

    @RequestMapping(value = "/getByPage.do")
    @ResponseBody
    public Map<String, Object> getByPage(HttpServletRequest request){
        String keys = request.getParameter("keys");
        Integer start = Integer.parseInt(request.getParameter("start"));
        Integer length = Integer.parseInt(request.getParameter("length"));
        return bankDepositService.getByPage(keys, start, length);
    }*/
}
