package com.imooc.sell.utils;

import com.imooc.sell.enums.CodeEnum;

/**
 * 描述： TODO
 *
 * @create: 2020-02-02 19:04
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}