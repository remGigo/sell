package com.imooc.sell.utils;

import com.imooc.sell.VO.ResultVO;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

/**
 * 描述： TODO
 *
 * @create: 2020-01-29 08:52
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();

        resultVO.setData(object);
        resultVO.setMsg("成功");
        resultVO.setCode(0);

        return resultVO;
    }

//    有必要吗
    public static ResultVO success(){
        return success(null);
    }


    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setMsg(msg);
        resultVO.setCode(code);
        return resultVO;
    }


}
