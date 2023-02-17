package com.dk.cs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dk.cs.pojo.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 板凳宽宽
 */
@Mapper
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {
    List<ShoppingCart> shoppingCartById(String userName);
}
