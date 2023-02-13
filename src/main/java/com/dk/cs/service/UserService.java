package com.dk.cs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dk.cs.pojo.UserTable;

/**
 * 板凳宽宽
 */
public interface UserService extends IService<UserTable> {
    UserTable getUserByName(String uName);

    void addUser(UserTable userTable);

    UserTable getUserByuCode(int uCode);

    void upUser(UserTable userTable);


    void deleteUser(UserTable a);
}
