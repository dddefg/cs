package com.dk.cs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dk.cs.pojo.ShoppingCart;
import com.dk.cs.pojo.UserTable;

import java.util.List;

/**
 * 板凳宽宽
 */
public interface UserService extends IService<UserTable> {

    UserTable getUserByName(String userName);

    boolean addUser(UserTable userTable);

    boolean deleteUser(UserTable a);

}
