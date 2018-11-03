package com.bank.service.Impl;

import com.bank.mapper.BankUserMapper;
import com.bank.pojo.BankUser;
import com.bank.pojo.BankUserExample;
import com.bank.service.IUserService;
import com.bank.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lujiafeng on 2018/10/14.
 */

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private BankUserMapper bankUserMapper;

    @Override
    public void add(BankUser user) {
        BankUserExample example = new BankUserExample();
        //UserName与phone不能重复
        example.createCriteria().andUserNameEqualTo(user.getUserName()).andPhoneEqualTo(user.getPhone());
        List<BankUser> bankUserList = bankUserMapper.selectByExample(example);
        if (bankUserList.isEmpty()) {
            user.setUserId(user.getPhone());
            String pw = user.getPassword();
            pw = MD5.string2MD5(pw);
            user.setPassword(pw);
            bankUserMapper.insert(user);
            System.out.println("插入用户成功");
        } else {
            System.out.println("插入用户失败");
        }
    }

    @Override
    public boolean isExist(String username) {
        BankUserExample example = new BankUserExample();
        example.createCriteria().andUserNameEqualTo(username);
        List<BankUser> userList = bankUserMapper.selectByExample(example);
        if (userList.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void delete(String uid) {
        BankUser user = bankUserMapper.selectByPrimaryKey(uid);
        if (null == user) {
            System.out.println("该用户不存在，删除失败");
        } else {
            //user.setStatus("deleted");
            bankUserMapper.updateByPrimaryKey(user);
            System.out.println("删除用户成功");
        }
    }

    @Override
    public BankUser getUserById(String uid) {
        return bankUserMapper.selectByPrimaryKey(uid);
    }

    @Override
    public BankUser login(String username, String password) {
        BankUserExample example = new BankUserExample();
        String pw = MD5.string2MD5(password);
        example.createCriteria().andUserNameEqualTo(username).andPasswordEqualTo(pw);
        List<BankUser> bankUserList = bankUserMapper.selectByExample(example);
        if (bankUserList.isEmpty()) {
            return null;
        } else {
            return bankUserList.get(0);
        }
    }

    @Override
    public List<BankUser> getUsers() {
        BankUserExample example = new BankUserExample();
        example.setOrderByClause("user_id desc");
        List<BankUser> bankUserList = bankUserMapper.selectByExample(example);
        return bankUserList;
    }

    @Override
    public List<BankUser> getUsers(BankUserExample example) {
        return bankUserMapper.selectByExample(example);
    }

    @Override
    public boolean update(BankUser user) {
        BankUserExample example = new BankUserExample();
        example.createCriteria().andUserNameEqualTo(user.getUserName()).andUserIdEqualTo(user.getUserId());
        List<BankUser> userList = bankUserMapper.selectByExample(example);
        if (userList.isEmpty()) {
            return false;
        } else {
            // 按主键更新值不为null的字段
            bankUserMapper.updateByPrimaryKeySelective(user);
            return true;
        }
    }

    @Override
    public boolean changePassword(String username, String oldpassword, String newpassword) {
        BankUserExample example = new BankUserExample();
        example.createCriteria().andUserNameEqualTo(username);
        List<BankUser> userList = bankUserMapper.selectByExample(example);
        if (userList.isEmpty()) {
            return false;
        } else {
            BankUser user = userList.get(0);
            String oldpw = MD5.string2MD5(oldpassword);
            if (oldpw.equals(user.getPassword())) {
                String pw = MD5.string2MD5(newpassword);
                user.setPassword(pw);
                bankUserMapper.updateByPrimaryKey(user);
                return true;
            } else {
                return false;
            }
        }
    }
}
