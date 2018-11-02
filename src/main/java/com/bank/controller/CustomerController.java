package com.bank.controller;

import com.bank.pojo.BankAccount;
import com.bank.pojo.BankCustomer;
import com.bank.service.IAccountService;
import com.bank.service.ICustomerService;
import com.bank.utils.BankResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by lujiafeng on 2018/10/17.
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private final static Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IAccountService accountService;


    // 返回所有客户信息（已测试）
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public BankResult getAllCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<BankCustomer> customerList = customerService.getCustomers();
        BankResult bankResult = new BankResult();
        bankResult.setStatus(200);
        bankResult.setData(customerList);
        return bankResult;
    }

    // 返回单个客户信息（已测试）
    @RequestMapping(value = "/{custID}", method = RequestMethod.GET)
    @ResponseBody
    public BankResult getOneCustomer(@PathVariable String custID , HttpServletRequest request, HttpServletResponse response) {
        BankCustomer customer = customerService.getCustomerById(custID);
        BankResult bankResult = new BankResult(200, "ok", customer);
        return bankResult;
    }

    // 新建一个客户（已测试）
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    @ResponseBody
    public BankResult addCustomer(BankCustomer customer, HttpServletRequest request, HttpServletResponse response) {
       //初始时要设置加信用 如    customer.setCredit("1");
        String custName = customer.getCustName();
        BankResult bankResult = new BankResult();
        if (customerService.isExist(custName)) {
            String msg = "用户名已存在";
            bankResult.setMsg(msg);
            return bankResult;
        }
        String cust_id = customerService.add(customer);
        bankResult.setData(cust_id);
        bankResult.setMsg("ok");
        bankResult.setStatus(200);
        return bankResult;
    }

    // 修改客户信息（已测试）
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public BankResult updateAccount(BankCustomer customer, HttpServletRequest request, HttpServletResponse response) {
        //密码没md5
        boolean flag = customerService.update(customer);
        if (flag == true) {
            return BankResult.ok();
        } else {
            BankResult bankResult = new BankResult();
            String msg = "修改失败，请检查客户信息是否正确";
            bankResult.setMsg(msg);
            bankResult.setStatus(123);
            return bankResult;
        }
    }


    // 返回该id的客户所有账户信息（返回中文乱码）
    @RequestMapping(value = "/account/{custId}", method = RequestMethod.GET)
    @ResponseBody
    public BankResult getAccounts(@PathVariable String custId, HttpServletRequest request, HttpServletResponse response) {
        List<BankAccount> accountList = accountService.getAccounts(custId);
        return new BankResult(200, "ok", accountList);
    }


    // 新建一个账户（已测试）
    @RequestMapping(value = "/account/new", method = RequestMethod.POST)
    @ResponseBody
    public BankResult addAccount(@RequestParam(value = "custName") String custName, BankAccount account, HttpServletRequest request, HttpServletResponse response) {
        System.out.println(custName);
        System.out.println(account.toString());
        //account_status没设置，balances两个没设置
        boolean success = accountService.add(custName, account);
        if (success) {

            return BankResult.ok();
        } else {
            BankResult bankResult = new BankResult();
            String msg = "创建账户失败";
            bankResult.setMsg(msg);
            bankResult.setStatus(123);
            return bankResult;
        }
    }

    // 删除一个账户（已测试）
    @RequestMapping(value = "/account/delete", method = RequestMethod.POST)
    @ResponseBody
    public BankResult deleteAccount(@RequestParam(value = "account") String account, HttpServletRequest request, HttpServletResponse response) {
        boolean success = accountService.delete(account);
        if (success) {
            return BankResult.ok();
        } else {
            BankResult bankResult = new BankResult();
            String msg = "删除账户失败";
            bankResult.setMsg(msg);
            bankResult.setStatus(123);
            return bankResult;
        }
    }


}
