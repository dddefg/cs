package com.dk.cs;

import com.dk.cs.pojo.UserTable;
import com.dk.cs.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CsApplicationTests {


    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        UserTable a = new UserTable(5, "12113", "123", 1, "a");
//        userService.upUser(a);
userService.deleteUser(a);

    }

}
