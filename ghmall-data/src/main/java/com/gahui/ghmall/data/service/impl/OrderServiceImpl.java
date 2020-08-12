package com.gahui.ghmall.data.service.impl;

import com.gahui.ghmall.comm.constant.Constant;
import com.gahui.ghmall.comm.util.GhCopyUtil;
import com.gahui.ghmall.data.dto.OrderDto;
import com.gahui.ghmall.data.entity.GhOrder;
import com.gahui.ghmall.data.entity.GhOrderExample;
import com.gahui.ghmall.data.mapper.GhOrderMapper;
import com.gahui.ghmall.data.service.OrderItemService;
import com.gahui.ghmall.data.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/12
 **/
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Resource
    GhOrderMapper orderMapper;

    @Resource
    OrderItemService orderItemService;

    @Override
    public OrderDto getOrderByOrderId(int orderId) {
        GhOrderExample example = new GhOrderExample();
        example.createCriteria().andOrderIdEqualTo(orderId).andStatusEqualTo(Constant.STATUS_EFF);
        List<GhOrder> selectOrders = orderMapper.selectByExample(example);
        GhOrder order = new GhOrder();
        if (selectOrders != null && selectOrders.size() > 0) {
            order = selectOrders.get(0);
        }
        return GhCopyUtil.copyProperties(order, OrderDto.class);
    }

    @Override
    public PageInfo<OrderDto> getOrderByUserId(int userId, int pageNum, int pageSize) {
        GhOrderExample example = new GhOrderExample();
        example.createCriteria().andUserIdEqualTo(userId).andStatusEqualTo(Constant.STATUS_EFF);
        return this.listOrderItemByExample(example, pageNum, pageSize);
    }

    private PageInfo<OrderDto> listOrderItemByExample(GhOrderExample example, int pageNum, int pageSize) {
        pageNum = pageNum > Constant.PAGE_NUM_LIMIT ? Constant.PAGE_NUM_LIMIT : pageNum;
        pageSize = pageSize > Constant.PAGE_SIZE_LIMIT ? Constant.PAGE_SIZE_LIMIT : pageSize;
        PageHelper.startPage(pageNum, pageSize);
        List<OrderDto> orderDtos = GhCopyUtil.copyListProperties(orderMapper.selectByExample(example), OrderDto.class);
        return new PageInfo<>(orderDtos);
    }
}
