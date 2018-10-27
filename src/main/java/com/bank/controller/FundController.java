package com.bank.controller;


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

    @RequestMapping(value = "/fund/create",method = RequestMethod.POST)
    @ResponseBody
    public BankResult createFundProduct(@RequestParam(value = "type")String type,
                                        @RequestParam(value = "purchase_rate")double purchase_rate,
                                        @RequestParam(value = "net_asset_value")double net_asset_value,
                                        @RequestParam(value = "redemption_rate")double redemption_rate) {
        // service层操作
        String fundId = fundService.createFundProduct(type, purchase_rate, net_asset_value, redemption_rate);
        return BankResult.ok(fundId);
    }

    @RequestMapping(value = "/fund/query",method = RequestMethod.POST)
    @ResponseBody
    public BankResult getFundProducts() {
        // service层操作
        List<BankFundProduct> bankFundProductList = fundService.getFundProducts();

        return BankResult.ok(bankFundProductList);
    }

    @RequestMapping(value = "/fund/tx",method = RequestMethod.POST)
    @ResponseBody
    public BankResult createFundTx(String custId, String account, String fundId, String type, double amount) {
        // service层操作
        BankResult bankResult = fundService.createFundTx(custId, account, fundId, type, amount);

        return bankResult;
    }

}
