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
    public UserTable getUserByName(String userName) {
        return userMapper.getUserByName(userName);
    }

    @Override
    public boolean addUser(UserTable userTable) {
        return userMapper.addUser(userTable);
    }

    @Override
    public boolean deleteUser(UserTable a) {
        return userMapper.deleteUser(a);
    }
}
