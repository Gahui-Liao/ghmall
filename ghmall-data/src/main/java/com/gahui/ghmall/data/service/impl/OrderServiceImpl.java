package com.gahui.ghmall.data.service.impl;

import com.gahui.ghmall.comm.constant.Constant;
import com.gahui.ghmall.comm.util.GhCopyUtil;
import com.gahui.ghmall.data.dto.OrderDto;
import com.gahui.ghmall.data.entity.GhOrder;
import com.gahui.ghmall.data.entity.GhOrderExample;
import com.gahui.ghmall.data.mapper.GhOrderMapper;
import com.gahui.ghmall.data.service.OrderItemService;
import com.gahui.ghmall.data.service.OrderService;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/12
 **/
public class OrderServiceImpl implements OrderService {

    @Resource
    GhOrderMapper orderMapper;

    @Resource
    OrderItemService orderItemService;

    @Override
    public OrderDto getOrderByOrderId(int orderId, int orderItemPageNum, int orderItemPageSize) {
        GhOrderExample example = new GhOrderExample();
        example.createCriteria().andOrderIdEqualTo(orderId).andStatusEqualTo(Constant.STATUS_EFF);
        List<GhOrder> selectOrders = orderMapper.selectByExample(example);
        GhOrder order = new GhOrder();
        if (selectOrders != null) {
            order = selectOrders.get(0);
        }
        return GhCopyUtil.copyProperties(order, OrderDto.class);
    }

    @Override
    public PageInfo<OrderDto> getOrderByUserId(int userId) {
        return null;
    }
}
