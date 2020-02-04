package com.imooc.sell.service;

import com.imooc.sell.dataobject.OrderMaster;
import com.imooc.sell.dto.OrderDTO;
import org.hibernate.criterion.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {

    //创建订单            不用OrderMaster而重造一个OrderDetail的原因是前端传来的json就带OrderDetail的
    OrderDTO create(OrderDTO orderDTO);

    //查询单个订单         嗯嗯一定要返回带OrderDetail的对象嘛，因为前端业务需求鸭
    OrderDTO findOne(String orderId);

    //查询订单列表
    Page<OrderDTO> findList(String buyOpenId, Pageable pageable);

    //取消订单
    OrderDTO cancel(OrderDTO orderDTO);

    //完成订单
    OrderDTO finish(OrderDTO orderDTO);

    //支付订单
    OrderDTO paid(OrderDTO orderDTO);

    //开始写卖家端订单了
    //查询订单列表
    Page<OrderDTO> findList(Pageable pageable);

}
