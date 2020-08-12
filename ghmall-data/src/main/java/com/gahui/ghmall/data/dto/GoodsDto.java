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
public class GoodsDto extends BaseDto {
    private Integer goodsId;

    private String goodsCode;

    private Integer categoryId;

    private String goodsBrief;

    private String goodsIconUrl;

    private Integer goodsSellNum;

    private String goodsDetail;

    private List<GoodsImgDto> goodsImgs;

    private List<GoodsSpecDto> goodsSpecs;

    private List<GoodsGalleryDto> goodsGallerys;
}
