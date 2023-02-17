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
    private String userName;
    private String goodsName;
    private double goodsPrice;
    private Integer goodsNum;
    private String goodsId;
    private String sellerName;
}
