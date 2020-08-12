package com.gahui.ghmall.data.service;

import com.gahui.ghmall.data.dto.AdvertisementDto;

import java.util.List;

/**
 * @description: 广告相关数据业务
 * @author: liaojiaxi
 * @date: 2020/8/6
 **/
public interface AdvertisementService {
    List<AdvertisementDto> listAdvertisementBySeqDesc();
}
