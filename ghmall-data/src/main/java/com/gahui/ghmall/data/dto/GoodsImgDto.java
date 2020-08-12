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
public class GoodsImgDto extends BaseDto {
    private Integer goodsImgId;

    private Integer goodsId;

    private String goodsImgUrl;

    private Byte goodsImgSeq;
}
