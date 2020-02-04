package com.imooc.sell.repository;


import com.imooc.sell.dataobject.OrderMaster;
import jdk.nashorn.internal.objects.NativeError;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private final String OPENID = "110110";

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("4");
        orderMaster.setBuyerName("廖师兄");
        orderMaster.setBuyerPhone("123456789123");
        orderMaster.setBuyerAddress("幕课网");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(2.5));

        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid(){

        PageRequest pageRequest = new PageRequest(0,2);

        Page<OrderMaster> result = repository.findByBuyerOpenid(OPENID, pageRequest);
        //在下一行打断点可以看看分页查询的结果~
        Assert.assertNotEquals(0,result.getTotalElements());
    }

}
