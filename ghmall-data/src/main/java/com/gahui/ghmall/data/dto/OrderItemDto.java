package com.gahui.ghmall.data.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/4
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class OrderItemDto extends BaseDto {
    private Integer orderItemId;

    private Integer orderId;

    private String orderItemCode;

    private Integer goodsId;

    private Byte orderItemFlowNum;

    private Byte orderItemPayNum;

    private BigDecimal orderItemOrginalPrice;

    private BigDecimal orderItemFinalPrice;

    private BigDecimal orderItemDiscountAmount;

    private Integer userId;

    private Integer commentId;

    private GoodsDto goods;
}
