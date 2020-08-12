package com.gahui.ghmall.data.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/4
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class OrderDto extends BaseDto {
    private Integer orderId;

    private String orderCode;

    private Byte orderFlowNum;

    private Byte orderPayNum;

    private BigDecimal orderOrginalPrice;

    private BigDecimal orderFinalPrice;

    private BigDecimal orderDiscountAmount;

    private Integer userId;

    private List<OrderItemDto> orderItems;
}
