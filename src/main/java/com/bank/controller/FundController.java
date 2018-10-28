package com.bank.controller;


import com.bank.pojo.BankFundHold;
import com.bank.pojo.BankFundLog;
import com.bank.pojo.BankFundProduct;
import com.bank.service.FundService;
import com.bank.utils.BankResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
        String fundId = fundService.createFundProduct(type, purchase_rate, net_asset_value, redemption_rate);
        return BankResult.ok(fundId);
    }

    @RequestMapping(value = "/fund/create/tx/purchase",method = RequestMethod.POST)
    @ResponseBody
    public BankResult createFundPurchaseTx(@RequestParam(value = "cust_id")String custId,
                                           @RequestParam(value = "account")String account,
                                           @RequestParam(value = "fund_id")String fundId,
                                           @RequestParam(value = "type")String type,
                                           @RequestParam(value = "amount")double amount) {
        // service层操作
        BankResult bankResult = fundService.createFundPurchaseTx(custId, account, fundId, type, amount);

        return bankResult;
    }

    @RequestMapping(value = "/fund/create/tx/redemption",method = RequestMethod.POST)
    @ResponseBody
    public BankResult createFundRedemptionTx(@RequestParam(value = "account")String account,
                                             @RequestParam(value = "fund_id")String fundId,
                                             @RequestParam(value = "share")double share) {
        // service层操作
        BankResult bankResult = fundService.createFundRedemptionTx(account, fundId, share);

        return BankResult.ok();
    }

    @RequestMapping(value = "/fund/query/product",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getFundProducts() {
        // service层操作
        List<BankFundProduct> bankFundProductList = fundService.getFundProducts();

        return BankResult.ok(bankFundProductList);
    }

    @RequestMapping(value = "/fund/query/tx",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getFundLogs() {
        // service层操作
        List<BankFundLog> bankFundLogList = fundService.getFundLogs();

        return BankResult.ok(bankFundLogList);
    }

    @RequestMapping(value = "/fund/query/hold",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getFundHolds() {
        // service层操作
        List<BankFundHold> bankFundHoldList = fundService.getFundHolds();

        return BankResult.ok(bankFundHoldList);
    }


}
