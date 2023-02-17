package com.dk.cs;

import com.dk.cs.pojo.ShoppingCart;
import com.dk.cs.pojo.UserTable;
import com.dk.cs.service.ShoppingCartService;
import com.dk.cs.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CsApplicationTests {


    @Autowired
    UserService userService;
    @Autowired
    ShoppingCartService shoppingCartService;
    @Test
    void contextLoads() {
        List<ShoppingCart> admin = shoppingCartService.shoppingCartById("admin");
        System.out.println(admin);

    }

}
