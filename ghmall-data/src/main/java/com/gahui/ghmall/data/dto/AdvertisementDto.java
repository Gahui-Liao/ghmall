package com.gahui.ghmall.data.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/4
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class AdvertisementDto extends BaseDto {
    private Integer advertisementId;

    private String advertisementImgUrl;

    private Integer goodsId;

    private Date advertisementEffTime;

    private Date advertisementExpTime;

    private Byte advertisementSeq;
}
