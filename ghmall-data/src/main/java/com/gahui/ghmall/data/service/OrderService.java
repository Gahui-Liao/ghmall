package com.gahui.ghmall.data.service;

import com.gahui.ghmall.data.dto.OrderDto;
import com.github.pagehelper.PageInfo;

/**
 * @description: 订单相关业务
 * @author: liaojiaxi
 * @date: 2020/8/12
 **/
public interface OrderService {

    /**
     * 根据订单Id查询订单
     *
     * @param orderId
     * @return
     */
    OrderDto getOrderByOrderId(int orderId);

    /**
     * 根据用户Id查询订单
     *
     * @param userId
     * @return
     */
    PageInfo<OrderDto> listOrderByUserId(int userId, int pageNum, int pageSize);
}
