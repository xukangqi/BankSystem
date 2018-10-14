package com.bank.service.Impl;

import com.bank.pojo.User;
import com.bank.pojo.UserExample;
import com.bank.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lujiafeng on 2018/10/14.
 */

@Service
public class UserServiceImpl implements IUserService {

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(Integer uid) {

    }

    @Override
    public User getUser(Integer uid) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public List<User> getUsers(UserExample example) {
        return null;
    }

    @Override
    public void update(User user) {

    }
}
