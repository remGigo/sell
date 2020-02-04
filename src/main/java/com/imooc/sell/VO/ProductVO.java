package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 描述： 商品(包含类目)
 *
 * @create: 2020-01-28 16:44
 */
@Data
public class ProductVO implements Serializable {

    private static final long serialVersionUID = 3355332619015620687L;

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;


}
