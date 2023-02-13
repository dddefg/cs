package com.dk.cs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dk.cs.mapper.UserMapper;
import com.dk.cs.pojo.UserTable;
import com.dk.cs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 板凳宽宽
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserTable> implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserTable getUserByName(String uName) {
        return userMapper.getUserByName(uName);
    }

    @Override
    public void addUser(UserTable userTable) {
        userMapper.addUser(userTable);
    }

    @Override
    public UserTable getUserByuCode(int uCode) {
        return userMapper.getUserByuCode(uCode);
    }

    @Override
    public void upUser(UserTable userTable) {
        userMapper.upUser(userTable);
    }

    @Override
    public void deleteUser(UserTable a) {
        userMapper.deleteUser(a);
    }


}
