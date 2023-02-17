package com.dk.cs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dk.cs.pojo.ShoppingCart;

import java.util.List;

/**
 * 板凳宽宽
 */

public interface ShoppingCartService extends IService<ShoppingCart> {
    List<ShoppingCart> shoppingCartById(String userName);
}
