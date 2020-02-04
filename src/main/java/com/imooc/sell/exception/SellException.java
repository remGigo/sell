package com.imooc.sell.exception;

import com.imooc.sell.enums.ResultEnum;

/**
 * 描述： TODO
 *
 * @create: 2020-01-29 11:55
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String defaultMessage) {

        super(defaultMessage);

        this.code = code;
    }
}
