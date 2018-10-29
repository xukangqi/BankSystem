package com.bank.controller;

import com.bank.service.FundService;
import com.bank.utils.BankResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class FundController {

    @Autowired
    private FundService fundService;

    @RequestMapping(value = "/fund/create/product",method = RequestMethod.POST)
    @ResponseBody
    public BankResult createFundProduct(@RequestParam(value = "type")String type,
                                        @RequestParam(value = "purchase_rate")double purchase_rate,
                                        @RequestParam(value = "net_asset_value")double net_asset_value,
                                        @RequestParam(value = "redemption_rate")double redemption_rate) {
        // service层操作
        BankResult bankResult = fundService.createFundProduct(type, purchase_rate, net_asset_value, redemption_rate);
        return bankResult;
    }

    @RequestMapping(value = "/fund/create/tx/purchase",method = RequestMethod.POST)
    @ResponseBody
    public BankResult createFundPurchaseTx(@RequestParam(value = "cust_id")String custId,
                                           @RequestParam(value = "account")String account,
                                           @RequestParam(value = "fund_id")String fundId,
                                           @RequestParam(value = "amount")double amount) {
        // service层操作
        BankResult bankResult = fundService.createFundPurchaseTx(custId, account, fundId, amount);

        return bankResult;
    }

    @RequestMapping(value = "/fund/create/tx/redemption",method = RequestMethod.POST)
    @ResponseBody
    public BankResult createFundRedemptionTx(@RequestParam(value = "account")String account,
                                             @RequestParam(value = "fund_id")String fundId,
                                             @RequestParam(value = "share")double share) {
        // service层操作
        BankResult bankResult = fundService.createFundRedemptionTx(account, fundId, share);

        return bankResult;
    }

    @RequestMapping(value = "/fund/query/product",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getFundProducts() {
        // service层操作
        BankResult bankResult = fundService.getFundProducts();

        return bankResult;
    }

    @RequestMapping(value = "/fund/query/tx",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getFundLogs() {
        // service层操作
        BankResult bankResult = fundService.getFundLogs();

        return bankResult;
    }

    @RequestMapping(value = "/fund/query/hold",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getFundHolds() {
        // service层操作
        BankResult bankResult = fundService.getFundHolds();

        return bankResult;
    }
}
