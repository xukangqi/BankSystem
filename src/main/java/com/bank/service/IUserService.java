package com.bank.service;

import com.bank.pojo.BankUser;
import com.bank.pojo.BankUserExample;

import java.util.List;

/**
 * Created by lujiafeng on 2018/10/14.
 */

public interface IUserService {

    /**
     * 插入用户
     * @param user
     */
    void add(BankUser user);

    /**
     * 检查用户名是否存在
     * @param username
     * @return
     */
    boolean isExist(String username);

    /**
     * 根据主键删除用户（实际只修改用户状态）
     * @param uid
     */
    void delete(String uid);

    /**
     * 根据主键获取用户
     * @param uid
     * @return
     */
    BankUser getUserById(String uid);

    /**
     * 登入
     * @param username
     * @param password
     * @return
     */
    BankUser login(String username, String password);

    /**
     * 获取所有用户
     * @return
     */
    List<BankUser> getUsers();

    /**
     * 获取符合条件的用户
     * @param example
     * @return
     */
    List<BankUser> getUsers(BankUserExample example);

    /**
     * 更新
     * @param user
     */
    boolean update(BankUser user);

    /**
     * 修改密码
     * @param username
     * @param oldpassword
     * @param newpassword
     * @return
     */
    boolean changePassword(String username, String oldpassword, String newpassword);

}
