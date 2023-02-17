package com.dk.cs.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 板凳宽宽
 * 购物车
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShoppingCart {
    private String userName;  //购物车所属用户
    private String goodsName;   //商品名
    private double goodsPrice;  //商品价格
    private Integer goodsNum;   //数量
    private String goodsId;     //商品ID
    private String sellerName;  //卖家(店铺)
}
