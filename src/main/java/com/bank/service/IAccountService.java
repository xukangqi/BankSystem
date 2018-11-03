package com.bank.service;

import com.bank.pojo.BankAccount;
import com.bank.pojo.BankAccountExample;

import java.util.List;

/**
 * Created by lujiafeng on 2018/10/17.
 */
public interface IAccountService {

    /**
     * 插入账户
     * @param account
     */
    boolean add(String custName, BankAccount account);

    /**
     * 根据主键删除账户（实际只修改账户状态）
     * @param account_id
     */
    boolean delete(String account_id);

    /**
     * 根据主键获取账户
     * @param account_id
     * @return
     */
    BankAccount getAccount(String account_id);

    /**
     * 获取所有账户
     * @return
     */
    List<BankAccount> getAccounts();

    /**
     * 获取某客户的所有账户
     * @param cust_id
     * @return
     */
    List<BankAccount> getAccounts(String cust_id);

    /**
     * 获取符合条件的账户
     * @param example
     * @return
     */
    List<BankAccount> getAccounts(BankAccountExample example);

    /**
     * 更新
     * @param account
     */
    void update(BankAccount account);


}
