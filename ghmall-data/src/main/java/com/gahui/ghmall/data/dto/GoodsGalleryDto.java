package com.gahui.ghmall.data.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/7
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class GoodsGalleryDto extends BaseDto {
    private Integer goodsGalleryId;

    private Integer goodsId;

    private String goodsGalleryUrl;

    private Byte goodsGallerySeq;
}
