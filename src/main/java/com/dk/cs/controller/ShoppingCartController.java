package com.dk.cs.controller;

import com.dk.cs.pojo.ShoppingCart;
import com.dk.cs.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 板凳宽宽
 */
@RestController
public class ShoppingCartController {
    @Autowired
    ShoppingCartService shoppingCartService;

    @RequestMapping(value = "/shoppingCart/{userName}")
    public List<ShoppingCart> shoppingCartById(@PathVariable("userName") String userName){
        List<ShoppingCart> shoppingCart = shoppingCartService.shoppingCartById(userName);
        return shoppingCart;
    }
}
