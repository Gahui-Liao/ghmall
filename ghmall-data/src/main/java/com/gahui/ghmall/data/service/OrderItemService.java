package com.gahui.ghmall.data.service;

import com.gahui.ghmall.data.dto.OrderItemDto;
import com.github.pagehelper.PageInfo;

/**
 * @description: 订单项相关业务
 * @author: liaojiaxi
 * @date: 2020/8/12
 **/
public interface OrderItemService {

    /**
     * 根据订单项Id查询订单项
     *
     * @param orderItemId
     * @return
     */
    OrderItemDto getOrderItemByOrderItemId(int orderItemId);

    /**
     * 根据订单Id查询订单项
     *
     * @param orderId
     * @return
     */
    PageInfo<OrderItemDto> getOrderItemByOrderId(int orderId, int pageNum, int pageSize);

    /**
     * 根据用户Id查询订单项
     *
     * @param userId
     * @return
     */
    PageInfo<OrderItemDto> getOrderItemByUserId(int userId, int pageNum, int pageSize);
}
