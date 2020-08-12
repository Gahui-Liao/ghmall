package com.gahui.ghmall.data.service;

import com.gahui.ghmall.data.dto.CartDto;
import com.github.pagehelper.PageInfo;

/**
 * @description: 购物车相关业务
 * @author: liaojiaxi
 * @date: 2020/8/11
 **/
public interface CartService {

    /**
     * 获取购物车数量
     * @return
     */
    int getCartNumByUserId(int userId);

    /**
     * 购物车商品数据
     */
    PageInfo<CartDto> listCartByUserId(int userId, int pageNum, int pageSize);

    /**
     * 删除购物车中商品
     * @param userId
     * @param goodsId
     * @return
     */
    int deleteCartByUserIdAndCartId(int userId, int goodsId);
}
