package com.gahui.ghmall.data.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/4
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class CartDto extends BaseDto {
    private Integer cartId;

    private Integer goodsId;

    private Integer userId;

    private GoodsDto goods;
}
