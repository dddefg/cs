package com.dk.cs.controller;

import com.dk.cs.pojo.ShoppingCart;
import com.dk.cs.pojo.UserTable;
import com.dk.cs.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 板凳宽宽
 */
@RestController
public class ShoppingCartController {
    @Autowired
    ShoppingCartService shoppingCartService;

    @RequestMapping(value = "/shoppingCart")
    public List<ShoppingCart> shoppingCartById(HttpSession session){
        UserTable loginUser = (UserTable) session.getAttribute("loginUser");
        if (loginUser == null){
            return null;
        }
        List<ShoppingCart> shoppingCart = shoppingCartService.shoppingCartById(loginUser.getUserName());
        return shoppingCart;
    }
}
