package com.bank.service;

import com.bank.pojo.loan.BankLoanApplyInfo;
import com.bank.pojo.loan.BankLoanPaymentInfo;
import com.bank.utils.BankResult;

public interface LoanService {
    BankResult dealApplyment(BankLoanApplyInfo bankLoanApplyInfo);
    BankResult sentAllRecords();
    BankResult payForLoan(BankLoanPaymentInfo bankLoanPaymentInfo);
    BankResult sentOneRecord(long transId);
    BankResult getInterestRate();
    BankResult getInterestOneRate(int value);
    BankResult getPaylog(long value);
    BankResult getPaymentOneInfo(long value);
}
