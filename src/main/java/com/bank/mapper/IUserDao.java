package com.bank.mapper;

import com.bank.pojo.User;

public interface IUserDao {
    User getInformation(String telephone);
    int createUser(User user);
    void updateInformation(User user);
}
