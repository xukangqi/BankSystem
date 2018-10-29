package com.bank.service;

import com.bank.pojo.BankFundHold;
import com.bank.pojo.BankFundLog;
import com.bank.pojo.BankFundProduct;
import com.bank.utils.BankResult;

import java.util.List;

public interface FundService {
    BankResult createFundProduct(String type, double purchase_rate, double net_asset_value, double redemption_rate);
    BankResult createFundPurchaseTx(String custId, String account, String fundId, double amount);
    BankResult createFundRedemptionTx(String account, String fundId, double share);
    BankResult getFundProducts();
    BankResult getFundLogs();
    BankResult getFundHolds();
}
