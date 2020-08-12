package com.gahui.ghmall.data.service;

import com.gahui.ghmall.data.dto.GoodsDto;
import com.github.pagehelper.PageInfo;

/**
 * @description: 商品信息查询业务接口
 * @author: liaojiaxi
 * @date: 2020/8/5
 **/
public interface GoodsService {

    GoodsDto getGoodsByGoodsId(int goodsId);

    PageInfo<GoodsDto> listGoodsByCategoryId(int categoryId, int pageNum, int pageSize);

    PageInfo<GoodsDto> listGoodsByCreateTimeDesc(int pageNum, int pageSize);

    PageInfo<GoodsDto> listGoodsBySellNumDesc(int pageNum, int pageSize);

    PageInfo<GoodsDto> listGoodsByBrief(String goodsBrief, int pageNum, int pageSize);

    PageInfo<GoodsDto> listGoods(int pageNum, int pageSize);
}
