package com.bank.service;

import com.bank.pojo.loan.BankLoanApplyInfo;
import com.bank.pojo.loan.BankLoanPaymentInfo;
import com.bank.utils.BankResult;

public interface LoanService {
    BankResult dealApplyment(BankLoanApplyInfo bankLoanApplyInfo);
    BankResult sentAllRecords();
    BankResult payForLoan(BankLoanPaymentInfo bankLoanPaymentInfo);
    BankResult sentOneRecord(String transId);
    BankResult getInterestRate();
    BankResult getInterestOneRate(int value);
    BankResult getPaylog(String value);
    BankResult getPaymentOneInfo(String value);
}
