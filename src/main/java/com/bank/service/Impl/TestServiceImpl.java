package com.bank.service.Impl;

import com.bank.mapper.BankUserMapper;
import com.bank.pojo.BankUser;
import com.bank.pojo.BankUserExample;
import com.bank.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author xukangqi
* @date 2018/10/16 08:52
* @desc
*/
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private BankUserMapper bankUserMapper;

    @Override
    public void test1() {
        BankUser bankUser = bankUserMapper.selectByPrimaryKey("123");
    }

    @Override
    public void test2() {
        BankUserExample bankUserExample = new BankUserExample();
        BankUserExample.Criteria criteria = bankUserExample.createCriteria();
        //在criteria加各种查询条件
        criteria.andEmailEqualTo("123@123.com");
        List<BankUser> bankUserList = bankUserMapper.selectByExample(bankUserExample);
    }


}
