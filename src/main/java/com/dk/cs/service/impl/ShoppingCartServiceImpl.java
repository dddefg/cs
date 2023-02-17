package com.dk.cs.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dk.cs.mapper.ShoppingCartMapper;
import com.dk.cs.pojo.ShoppingCart;
import com.dk.cs.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 板凳宽宽
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
    @Autowired
    ShoppingCartMapper shoppingCartMapper;
    @Override
    public List<ShoppingCart> shoppingCartById(String userName) {
        return shoppingCartMapper.shoppingCartById(userName);
    }
}
