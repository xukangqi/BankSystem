package com.bank.service;

import com.bank.pojo.User;
import com.bank.pojo.UserExample;

import java.util.List;

/**
 * Created by lujiafeng on 2018/10/14.
 */

public interface IUserService {

    /**
     * 插入用户
     * @param user
     */
    void add(User user);

    /**
     * 根据主键删除用户
     * @param uid
     */
    void delete(Integer uid);

    /**
     * 根据主键获取用户
     * @param uid
     * @return
     */
    User getUser(Integer uid);

    /**
     * 获取所有用户
     * @return
     */
    List<User> getUsers();

    /**
     * 获取符合条件的用户
     * @param example
     * @return
     */
    List<User> getUsers(UserExample example);

    /**
     * 更新
     * @param user
     */
    void update(User user);


}
