package com.bank.service.Impl;

import com.bank.mapper.IUserDao;
import com.bank.pojo.User;
import com.bank.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private IUserDao userDao;

    @Override
    public void test() {
        userDao.createUser(new User("xu123","12124","sdfsd","123123"));
    }
}
