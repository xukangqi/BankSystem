package com.bank.service;

import com.bank.utils.BankResult;

public interface FundService {
    BankResult createFundProduct(String type, double purchase_rate, double net_asset_value, double redemption_rate);
    BankResult createFundPurchaseTx(String name, String phone, String account, String fundId, double amount, String password);
    BankResult createFundRedemptionTx(String account, String fundId, double share, String password);
    BankResult getFundProducts();
    BankResult getFundLogs();
    BankResult getFundHolds();
}
