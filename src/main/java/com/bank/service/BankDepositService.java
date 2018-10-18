package com.bank.service;

import com.bank.pojo.BankDeposite;
import com.bank.utils.BankResult;
import net.sf.json.JSONObject;

import java.util.List;

public interface BankDepositService {

    BankResult insert(BankDeposite bankDeposite);

    BankResult update(BankDeposite bankDeposite);

    BankResult delete(List<Long> depositeIds);

    BankResult getByPage(String keys, Integer pageStart, Integer pageSize);

}
