package com.imooc.sell.dto;

import lombok.Data;

/**
 * 描述： TODO
 *
 * @create: 2020-01-29 13:08
 */
@Data
public class CartDTO {

    //商品号
    private String productId;

    //商品数量
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
