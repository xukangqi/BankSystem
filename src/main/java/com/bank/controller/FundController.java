package com.bank.controller;

import com.bank.service.FundService;
import com.bank.utils.BankResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user/fund")
public class FundController {

    @Autowired
    private FundService fundService;

    @RequestMapping(value = "/create/product",method = RequestMethod.POST)
    @ResponseBody
    public BankResult createFundProduct(@RequestParam(value = "type")String type,
                                        @RequestParam(value = "purchaseRate")double purchaseRate,
                                        @RequestParam(value = "netAssetValue")double netAssetValue,
                                        @RequestParam(value = "redemptionRate")double redemptionRate) {
        // service层操作
        BankResult bankResult = fundService.createFundProduct(type, purchaseRate, netAssetValue, redemptionRate);
        return bankResult;
    }

    @RequestMapping(value = "/create/tx/purchase",method = RequestMethod.POST)
    @ResponseBody
    public BankResult createFundPurchaseTx(@RequestParam(value = "name")String name,
                                           @RequestParam(value = "phone")String phone,
                                           @RequestParam(value = "account")String account,
                                           @RequestParam(value = "fundId")String fundId,
                                           @RequestParam(value = "amount")double amount,
                                           @RequestParam(value = "password")String password,
                                           @RequestParam(value = "reviewerId")String reviewerId) {
        // service层操作
        BankResult bankResult = fundService.createFundPurchaseTx(name, phone, account, fundId, amount, password, reviewerId);

        return bankResult;
    }

    @RequestMapping(value = "/create/tx/redemption",method = RequestMethod.POST)
    @ResponseBody
    public BankResult createFundRedemptionTx(@RequestParam(value = "account")String account,
                                             @RequestParam(value = "fundId")String fundId,
                                             @RequestParam(value = "share")double share,
                                             @RequestParam(value = "password")String password,
                                             @RequestParam(value = "reviewerId")String reviewerId) {
        // service层操作
        BankResult bankResult = fundService.createFundRedemptionTx(account, fundId, share, password, reviewerId);

        return bankResult;
    }

    @RequestMapping(value = "/query/product",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getFundProducts() {
        // service层操作
        BankResult bankResult = fundService.getFundProducts();

        return bankResult;
    }

    // 请求格式/query/productdetail?fundId=123&purchaseDate=123
    @RequestMapping(value = "/query/productdetail",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getFundOneProduct(@RequestParam(value = "fundId")String fundId) {
        // service层操作
        BankResult bankResult = fundService.getOneFundProduct(fundId);

        return bankResult;
    }

    @RequestMapping(value = "/query/tx",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getFundLogs() {
        // service层操作
        BankResult bankResult = fundService.getFundLogs();

        return bankResult;
    }

    @RequestMapping(value = "/query/txdetail/{fundTxId}",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getOneFundLog(@PathVariable("fundTxId")String fundTxId) {
        // service层操作
        BankResult bankResult = fundService.getOneFundLog(fundTxId);

        return bankResult;
    }

    @RequestMapping(value = "/query/hold",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getFundHolds() {
        // service层操作
        BankResult bankResult = fundService.getFundHolds();

        return bankResult;
    }

    // 请求格式/query/holddetail?account=123&fundId=123
    @RequestMapping(value = "/query/holddetail",method = RequestMethod.GET)
    @ResponseBody
    public BankResult getOneFundHold(@RequestParam(value = "account")String account,
                                     @RequestParam(value = "fundId")String fundId) {
        // service层操作
        BankResult bankResult = fundService.getOneFundHold(account, fundId);

        return bankResult;
    }
}
