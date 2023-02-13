package com.dk.cs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dk.cs.pojo.UserTable;
import org.apache.ibatis.annotations.Mapper;

/**
 * 板凳宽宽
 */
@Mapper
public interface UserMapper extends BaseMapper<UserTable> {
    UserTable getUserByName(String uName);

    void addUser(UserTable userTable);

    UserTable getUserByuCode(int uCode);

    void upUser(UserTable userTable);


    void deleteUser(UserTable a);
}
