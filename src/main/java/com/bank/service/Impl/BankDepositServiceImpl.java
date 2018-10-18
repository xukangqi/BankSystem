package com.bank.service.Impl;

import com.bank.mapper.BankDepositeMapper;
import com.bank.pojo.BankDeposite;
import com.bank.pojo.BankDepositeExample;
import com.bank.service.BankDepositService;
import com.bank.utils.BankResult;
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
    public BankResult insert(BankDeposite bankDeposite) {

        if(bankDeposite == null){
            return BankResult.build(400, "参数错误");
        }

        if(snowFlake == null){
            snowFlake = new SnowFlake(1, 1);
        }

        bankDeposite.setDepositeId(snowFlake.nextId());
        bankDepositeMapper.insert(bankDeposite);
        return BankResult.build(200, "新增成功");
    }

    @Override
    public BankResult update(BankDeposite bankDeposite) {

        if(bankDeposite == null){
            return BankResult.build(400, "参数错误");
        }
        bankDepositeMapper.updateByPrimaryKeySelective(bankDeposite);
        return BankResult.build(200, "更新成功");
    }

    @Override
    public BankResult delete(List<Long> depositeIds) {

        if(depositeIds == null || depositeIds.size() == 0){
            return BankResult.build(400, "参数错误");
        }

        BankDepositeExample bankDepositeExample = new BankDepositeExample();
        bankDepositeExample.createCriteria().andDepositeIdIn(depositeIds);
        bankDepositeMapper.deleteByExample(bankDepositeExample);
        return BankResult.build(200, "删除成功");
    }

    @Override
    public BankResult getByPage(String keys, Integer pageStart, Integer pageSize) {

        return null;
    }
}
