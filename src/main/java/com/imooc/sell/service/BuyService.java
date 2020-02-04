package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;
import org.hibernate.criterion.Order;

public interface BuyService {

    //查询一个订单
    OrderDTO findOrderOne(String openId,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openId,String orderId);
}
