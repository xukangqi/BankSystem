package com.bank.service.Impl;

import com.bank.mapper.BankDepositeMapper;
import com.bank.pojo.BankDeposite;
import com.bank.service.BankDepositService;
import com.bank.utils.SnowFlake;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: BankSystem
 * @description: deposit
 * @author: i_know_i
 * @create: 2018-10-17 20:31
 **/
@Service
public class BankDepositServiceImpl implements BankDepositService {

    private SnowFlake snowFlake;

    @Autowired
    private BankDepositeMapper bankDepositeMapper;

    @Override
    public JSONObject insert(BankDeposite bankDeposite) {
        JSONObject jsonObject = new JSONObject();
        if(bankDeposite == null){
            jsonObject.put("result", "fail");
            jsonObject.put("message", "参数错误");
            jsonObject.put("data", "");
            return jsonObject;
        }

        if(snowFlake == null){
            snowFlake = new SnowFlake(1, 1);
        }

        bankDeposite.setDepositeId(snowFlake.nextId());
        bankDepositeMapper.insert(bankDeposite);
        jsonObject.put("result", "success");
        jsonObject.put("message", "参数错误");
        jsonObject.put("data", "");
        return null;
    }

    @Override
    public JSONObject update(BankDeposite bankDeposite) {
        return null;
    }

    @Override
    public JSONObject delete(List<Integer> depositeIds) {
        return null;
    }

    @Override
    public JSONObject getByPage(String keys, Integer pageStart, Integer pageSize) {
        return null;
    }
}
