package com.gahui.ghmall.data.service.impl;

import com.gahui.ghmall.comm.constant.Constant;
import com.gahui.ghmall.comm.util.GhCopyUtil;
import com.gahui.ghmall.data.dto.OrderItemDto;
import com.gahui.ghmall.data.entity.GhOrderItem;
import com.gahui.ghmall.data.entity.GhOrderItemExample;
import com.gahui.ghmall.data.mapper.GhOrderItemMapper;
import com.gahui.ghmall.data.service.GoodsService;
import com.gahui.ghmall.data.service.OrderItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/12
 **/
@Service("orderItemService")
public class OrderItemServiceImpl implements OrderItemService {

    @Resource
    GhOrderItemMapper orderItemMapper;

    @Resource
    GoodsService goodsService;

    @Override
    public OrderItemDto getOrderItemByOrderItemId(int orderItemId) {
        GhOrderItemExample orderItemExample = new GhOrderItemExample();
        orderItemExample.createCriteria().andOrderItemIdEqualTo(orderItemId).andStatusEqualTo(Constant.STATUS_EFF);
        GhOrderItem orderItem = new GhOrderItem();
        List<GhOrderItem> selectOrderItems = orderItemMapper.selectByExample(orderItemExample);
        if(selectOrderItems != null){
            orderItem = selectOrderItems.get(0);
        }
        OrderItemDto orderItemDto = GhCopyUtil.copyProperties(orderItem, OrderItemDto.class);
        if (orderItemDto != null) {
            orderItemDto.setGoods(goodsService.getGoodsByGoodsId(orderItemDto.getGoodsId()));
        }
        return orderItemDto;
    }

    @Override
    public PageInfo<OrderItemDto> listOrderItemByOrderId(int orderId, int pageNum, int pageSize) {
        GhOrderItemExample example = new GhOrderItemExample();
        example.createCriteria().andOrderIdEqualTo(orderId).andStatusEqualTo(Constant.STATUS_EFF);
        return this.listOrderItemByExample(example, pageNum, pageSize);
    }

    @Override
    public PageInfo<OrderItemDto> listOrderItemByUserId(int userId, int pageNum, int pageSize) {
        GhOrderItemExample example = new GhOrderItemExample();
        example.createCriteria().andUserIdEqualTo(userId).andStatusEqualTo(Constant.STATUS_EFF);
        return this.listOrderItemByExample(example, pageNum, pageSize);
    }

    private PageInfo<OrderItemDto> listOrderItemByExample(GhOrderItemExample example, int pageNum, int pageSize) {
        pageNum = pageNum > Constant.PAGE_NUM_LIMIT ? Constant.PAGE_NUM_LIMIT : pageNum;
        pageSize = pageSize > Constant.PAGE_SIZE_LIMIT ? Constant.PAGE_SIZE_LIMIT : pageSize;
        PageHelper.startPage(pageNum, pageSize);
        List<OrderItemDto> orderItemDtos = GhCopyUtil.copyListProperties(orderItemMapper.selectByExample(example), OrderItemDto.class);
        if (orderItemDtos != null) {
            for (OrderItemDto temp : orderItemDtos) {
                temp.setGoods(goodsService.getGoodsByGoodsId(temp.getGoodsId()));
            }
            return new PageInfo<>(orderItemDtos);
        }
        return null;
    }
}
