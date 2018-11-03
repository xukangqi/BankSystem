package com.bank.service.Impl;

import com.bank.mapper.BankCustomerMapper;
import com.bank.pojo.BankCustomer;
import com.bank.pojo.BankCustomerExample;
import com.bank.service.ICustomerService;
import com.bank.utils.MD5;
import com.bank.utils.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lujiafeng on 2018/10/17.
 */

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private BankCustomerMapper bankCustomerMapper;

    @Override
    public boolean isExist(String custName) {
        BankCustomerExample example = new BankCustomerExample();
        example.createCriteria().andCustNameEqualTo(custName);
        List<BankCustomer> bankCustomers = bankCustomerMapper.selectByExample(example);
        if (bankCustomers.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String add(BankCustomer customer) {
        SnowFlake snowFlake = new SnowFlake(2, 3);
        // 雪花算法生成唯一客户id
        String cust_id = String.valueOf(snowFlake.nextId());
        customer.setCustId(cust_id);
        String pw = MD5.string2MD5(customer.getPassword());
        customer.setPassword(pw);
        bankCustomerMapper.insert(customer);
        return cust_id;
    }

    @Override
    public void delete(String cust_id) {
        BankCustomerExample example = new BankCustomerExample();
        example.createCriteria().andCustIdEqualTo(cust_id);
        List<BankCustomer> bankCustomers = bankCustomerMapper.selectByExample(example);
        if (bankCustomers.isEmpty()) {
            System.out.println("删除客户失败");
        } else {
            BankCustomer customer = bankCustomers.get(0);
            customer.setCustType("deleted");
            System.out.println("删除客户成功");
        }
    }

    @Override
    public BankCustomer getCustomerById(String custId) {
        BankCustomer bankCustomer = bankCustomerMapper.selectByPrimaryKey(custId);
        bankCustomer.setPassword(null);
        return bankCustomer;
    }

    @Override
    public BankCustomer getCustomerByCustName(String custName) {
        BankCustomerExample example = new BankCustomerExample();
        example.createCriteria().andCustNameEqualTo(custName);
        List<BankCustomer> customerList = bankCustomerMapper.selectByExample(example);
        if (customerList.isEmpty()) {
            return null;
        } else {
            return customerList.get(0);
        }
    }

    @Override
    public List<BankCustomer> getCustomers() {
        BankCustomerExample example = new BankCustomerExample();
        example.setOrderByClause("cust_id desc");
        List<BankCustomer> bankCustomerList = bankCustomerMapper.selectByExample(example);
        for (BankCustomer bc : bankCustomerList) {
            bc.setPassword(null);
        }
        return bankCustomerList;
    }

    @Override
    public List<BankCustomer> getCustomers(BankCustomerExample example) {
        return bankCustomerMapper.selectByExample(example);
    }

    @Override
    public boolean update(BankCustomer customer) {
        //验证客户id 和 password
        BankCustomerExample example = new BankCustomerExample();
        example.createCriteria().andCustIdEqualTo(customer.getCustId());
        List<BankCustomer> bankCustomerList = bankCustomerMapper.selectByExample(example);
        if (bankCustomerList.isEmpty()) {
            return false;
        } else {
            if (null != customer.getPassword()) {
                String pw = MD5.string2MD5(customer.getPassword());
                customer.setPassword(pw);
            }
            bankCustomerMapper.updateByPrimaryKeySelective(customer);
            return true;
        }
    }
}
