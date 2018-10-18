package com.bank.service;

import com.bank.pojo.BankDeposite;
import net.sf.json.JSONObject;

import java.util.List;

public interface BankDepositService {

    JSONObject insert (BankDeposite bankDeposite);

    JSONObject update (BankDeposite bankDeposite);

    JSONObject delete (List<Integer> depositeIds);

    JSONObject getByPage (String keys, Integer pageStart, Integer pageSize);

}
