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
public class DeliveryDto extends BaseDto {
    private Integer deliveryId;

    private String deliveryCode;

    private Integer orderItemId;

    private Byte deliveryFlowNum;

    private String deliveryShipperName;

    private String deliveryShipperCode;

    private Integer userId;
}
