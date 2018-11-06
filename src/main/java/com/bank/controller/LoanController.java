package com.bank.controller;

import com.bank.pojo.loan.BankLoanApplyInfo;
import com.bank.pojo.loan.BankLoanPaymentInfo;
import com.bank.service.LoanService;
import com.bank.utils.BankResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    private LoanService loanService;

    //贷款申请
    @RequestMapping(value = "/apply",method = RequestMethod.POST)
    @ResponseBody
    public BankResult applyLoan(BankLoanApplyInfo bankLoanApplyInfo) {
        System.out.println(bankLoanApplyInfo.toString());
        return loanService.dealApplyment(bankLoanApplyInfo);
    }

    //还款信息登记
    @RequestMapping(value = "/payment",method = RequestMethod.POST)
    @ResponseBody
    public BankResult payForLoan(BankLoanPaymentInfo bankLoanPaymentInfo) {
        return loanService.payForLoan(bankLoanPaymentInfo);
    }

    //获取所有的贷款信息
    @RequestMapping(value = "/allRecord",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getAllRecords() {
        return loanService.sentAllRecords();
    }

    //获取单个贷款信息
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getOneRecord(@PathVariable("id")String id) {
        return loanService.sentOneRecord(id);
    }


    //还款信息获取
    @RequestMapping(value = "/payment/{transId}",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getPaymentOneInfo(@PathVariable("transId")String transId) {

        return loanService.getPaymentOneInfo(transId);
    }

    //获取利率信息
    @RequestMapping(value = "/interestRate",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getInterestRate() {
        return loanService.getInterestRate();
    }

    //获取利率信息
    @RequestMapping(value = "/interestRate/{value}",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getInterestOneRate(@PathVariable("value")int value) {
        return loanService.getInterestOneRate(value);
    }

    //获取还款日志
    @RequestMapping(value = "/paylog/{value}",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getPayLog(@PathVariable("value")String value) {
        return loanService.getPaylog(value);
    }
}
