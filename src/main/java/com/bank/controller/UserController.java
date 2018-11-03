package com.bank.controller;

import com.bank.pojo.BankUser;
import com.bank.pojo.BankUserExample;
import com.bank.service.IUserService;
import com.bank.utils.BankResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by lujiafeng on 2018/10/14.
 */


@Controller
@RequestMapping(value = "/user")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public BankResult delete(@RequestParam(value = "username") String username, HttpServletRequest request, HttpServletResponse response) {
        BankUserExample example = new BankUserExample();
        example.createCriteria().andUserNameEqualTo(username);
        List<BankUser> bankUserList = userService.getUsers(example);
        if (bankUserList.isEmpty()) {
            System.out.println("该用户不存在");
        } else {
            BankUser user = bankUserList.get(0);
            userService.delete(user.getUserId());
            System.out.println("删除用户成功");

        }
        return BankResult.ok();
    }

    // 用户登入 （已测试）
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public BankResult login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password, HttpServletRequest request, HttpServletResponse response) {
        System.out.println(username);
        BankUser user = userService.login(username, password);
        if (user == null) {
            BankResult bankResult = new BankResult();
            String msg = "登录失败,请检查账户、密码是否正确";
            bankResult.setStatus(123);
            bankResult.setMsg(msg);
            return bankResult;
        } else {
            user.setPassword(null);
            return new BankResult(200, "ok", user);
        }
    }

    // 用户注册（已测试）
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public BankResult register(BankUser bankUser, HttpServletRequest request, HttpServletResponse response) {
        System.out.println(bankUser.getUserName());
        boolean exist = userService.isExist(bankUser.getUserName());
        if (exist) {
            BankResult bankResult = new BankResult();
            String msg = "用户名已存在";
            bankResult.setMsg(msg);
            bankResult.setStatus(123);
            return bankResult;
        } else {
            userService.add(bankUser);
            return BankResult.ok();
        }
    }

    // 修改用户信息（已测试）
    @RequestMapping(value = "/changeinfo", method = RequestMethod.POST)
    @ResponseBody
    public BankResult changeinfo(BankUser user, HttpServletRequest request, HttpServletResponse response) {
        boolean isUpdate = userService.update(user);
        if (isUpdate) {
            return BankResult.ok();
        } else {
            BankResult bankResult = new BankResult();
            String msg = "更新失败";
            bankResult.setStatus(123);
            bankResult.setMsg(msg);
            return bankResult;
        }
    }

    // 修改用户密码（已测试）
    @RequestMapping(value = "/changepassword", method = RequestMethod.POST)
    @ResponseBody
    public BankResult changepassword(@RequestParam("username") String username, @RequestParam("oldpassword") String oldpassword,
                                     @RequestParam("newpassword") String newpassword,
                                     HttpServletRequest request, HttpServletResponse response) {
        //
        boolean success = userService.changePassword(username, oldpassword, newpassword);
        if (success) {
            return BankResult.ok();
        } else {
            BankResult bankResult = new BankResult();
            String msg = "旧密码错误";
            bankResult.setMsg(msg);
            bankResult.setStatus(123);
            return bankResult;
        }
    }

}
