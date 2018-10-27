package com.bank.service;

import com.bank.pojo.BankFundProduct;
import com.bank.utils.BankResult;

import java.util.List;

public interface FundService {
    String createFundProduct(String type, double purchase_rate, double net_asset_value, double redemption_rate);
    List<BankFundProduct> getFundProducts();
    BankResult createFundTx(String custId, String account, String fundId, String type, double amount);
}
