package com.imooc.sell;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 描述： TODO
 *
 * @create: 2020-01-27 18:21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data
public class LoggerTest {
//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1(){
        String name = "imooc";
        String password = "123456";
        log.debug("debug...");
        log.info("name: " + name + " ,password: " + password);
        log.info("name: {}, password: {}", name, password);
        log.error("error...");
        log.warn("warn...");
    }
}
