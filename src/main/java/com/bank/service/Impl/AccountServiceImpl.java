package com.bank.service.Impl;

import com.bank.mapper.BankAccountMapper;
import com.bank.pojo.BankAccount;
import com.bank.pojo.BankAccountExample;
import com.bank.pojo.BankCustomer;
import com.bank.service.IAccountService;
import com.bank.service.ICustomerService;
import com.bank.utils.BankNumberUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lujiafeng on 2018/10/17.
 */

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private BankAccountMapper bankAccountMapper;
    @Autowired
    private ICustomerService customerService;


    @Override
    public boolean add(String custName, BankAccount account) {
        BankCustomer customer = customerService.getCustomerByCustName(custName);
        if (null == customer) {
            System.out.println("该账户中的客户id不存在相对应的客户");
            return false;
        } else {
            String account_id = BankNumberUtil.getBrankNumber("8");
            account.setAccount(account_id);
            account.setCustId(customer.getCustId());
            account.setOpenDate(String.valueOf(System.currentTimeMillis()));
            bankAccountMapper.insert(account);
            System.out.println("账户插入成功");
            return true;
        }

    }

    @Override
    public boolean delete(String account_id) {
        BankAccount account = bankAccountMapper.selectByPrimaryKey(account_id);
        if (account == null) {
            System.out.println("该账户不存在");
            return false;
        } else {
            account.setAccountStatus("deleted");
            bankAccountMapper.updateByPrimaryKeySelective(account);
            System.out.println("账户删除成功");
            return true;
        }

    }

    @Override
    public BankAccount getAccount(String account_id) {
        return bankAccountMapper.selectByPrimaryKey(account_id);
    }

    @Override
    public List<BankAccount> getAccounts() {
        BankAccountExample example = new BankAccountExample();
        List<BankAccount> bankAccountList = bankAccountMapper.selectByExample(example);
        return bankAccountList;
    }

    @Override
    public List<BankAccount> getAccounts(String cust_id) {
        BankAccountExample example = new BankAccountExample();
        example.createCriteria().andCustIdEqualTo(cust_id);
        List<BankAccount> bankAccountList = bankAccountMapper.selectByExample(example);
        return bankAccountList;
    }

    @Override
    public List<BankAccount> getAccounts(BankAccountExample example) {
        List<BankAccount> bankAccountList = bankAccountMapper.selectByExample(example);
        return bankAccountList;
    }

    @Override
    public void update(BankAccount account) {
        bankAccountMapper.updateByPrimaryKey(account);
    }

}
