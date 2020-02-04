package com.imooc.sell.utils;

import java.util.Random;

/**
 * 描述： TODO
 *
 * @create: 2020-01-29 12:13
 */
public class KeyUtil {

    /**
     * 生成唯一主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey(){

        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }

}
