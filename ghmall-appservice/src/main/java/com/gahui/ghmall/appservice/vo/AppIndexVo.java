package com.gahui.ghmall.appservice.vo;

import com.gahui.ghmall.data.dto.AdvertisementDto;
import com.gahui.ghmall.data.dto.GoodsDto;
import com.gahui.ghmall.data.dto.NoticeDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/5
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class AppIndexVo extends BaseVo {

    /**
     * 加载广告数据
     */
    List<AdvertisementDto> advertisements;

    /**
     * 加载通知数据
     */
    List<NoticeDto> notices;

    /**
     * 新品推荐
     */
    List<GoodsDto> newGoods;

    /**
     * 热销商品推荐
     */
    List<GoodsDto> sellWellGoods;

    // TODO 秒杀商品数据
}
