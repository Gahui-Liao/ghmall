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
public class GoodsSpecDto extends BaseDto {
    private Integer goodsSpecId;

    private Integer goodsId;

    private String goodsSpecValue;

    private BigDecimal goodsSpecPrice;

    private Integer goodsSpecStorageNum;
}
