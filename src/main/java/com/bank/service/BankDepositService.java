package com.bank.service;

import com.bank.pojo.BankDeposit;
import com.bank.utils.BankResult;

import java.util.List;
import java.util.Map;

public interface BankDepositService {

    BankResult insert(BankDeposit bankDeposit, String password);

    BankResult update(BankDeposit bankDeposit);

    BankResult delete(List<String> depositIds);

//    Map<String, Object> getByPage(String keys, Integer pageStart, Integer pageSize);

//    List<BankDeposit> getAllBankDeposit();

    BankResult getBankDepositFromAccount(String account);

}
