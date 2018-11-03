package com.bank.service;

import com.bank.pojo.BankCustomer;
import com.bank.pojo.BankCustomerExample;

import java.util.List;

/**
 * Created by lujiafeng on 2018/10/17.
 */
public interface ICustomerService {

    /**
     * 验证客户名是否存在
     * @param custName
     * @return
     */
    boolean isExist(String custName);

    /**
     * 插入客户信息
     * @param customer
     */
    String add(BankCustomer customer);

    /**
     * 根据主键删除客户信息（实际只修改用户状态）
     * @param cust_id
     */
    void delete(String cust_id);

    /**
     * 根据主键获取客户信息
     * @param custId
     * @return
     */
    BankCustomer getCustomerById(String custId);

    /**
     * 根据客户名获取客户信息
     * @param custName
     * @return
     */
    BankCustomer getCustomerByCustName(String custName);

    /**
     * 获取所有客户
     * @return
     */
    List<BankCustomer> getCustomers();

    /**
     * 获取符合条件的客户
     * @param example
     * @return
     */
    List<BankCustomer> getCustomers(BankCustomerExample example);

    /**
     * 更新
     * @param customer
     */
    boolean update(BankCustomer customer);



}
