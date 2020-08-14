package com.gahui.ghmall.appservice.controller;

import com.gahui.ghmall.comm.en.GhResponseEnum;
import com.gahui.ghmall.comm.vo.GhResponse;
import com.gahui.ghmall.data.dto.OrderDto;
import com.gahui.ghmall.data.dto.OrderItemDto;
import com.gahui.ghmall.data.service.OrderItemService;
import com.gahui.ghmall.data.service.OrderService;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: 订单类相关接口
 * @author: liaojiaxi
 * @date: 2020/8/12
 **/
@Slf4j
@RestController
@RequestMapping("/order")
public class AppOrderController {

    @Resource
    OrderService orderService;
    @Resource
    OrderItemService orderItemService;

    @GetMapping("/id/{orderId}")
    public GhResponse getOrderByOrderId(@PathVariable("orderId") int orderId) {
        GhResponse<OrderDto> response = new GhResponse<>(GhResponseEnum.FAIL);
        OrderDto orderDto = orderService.getOrderByOrderId(orderId);
        if (orderDto != null) {
            response.setCodeAndMessageAndDataByEnum(GhResponseEnum.SUCCESS, orderDto);
        }
        log.info("getOrderByOrderId===>{}", response);
        return response;
    }

    @GetMapping("/{userId}/{pageNum}/{pageSize}")
    public GhResponse listOrderByUserId(@PathVariable("userId") int userId, @PathVariable("pageNum") int pageNum,
                                        @PathVariable("pageSize") int pageSize) {
        GhResponse<PageInfo<OrderDto>> response = new GhResponse<>(GhResponseEnum.FAIL);
        PageInfo<OrderDto> pageInfo = orderService.listOrderByUserId(userId, pageNum, pageSize);
        if (pageInfo != null) {
            response.setCodeAndMessageAndDataByEnum(GhResponseEnum.SUCCESS, pageInfo);
        }
        log.info("listOrderByUserId===>{}", response);
        return response;
    }

    @GetMapping("/Item/id/{orderItemId}")
    public GhResponse getOrderItemByOrderItemId(@PathVariable("orderItemId") int orderItemId) {
        GhResponse<OrderItemDto> response = new GhResponse<>(GhResponseEnum.FAIL);
        OrderItemDto orderItemDto = orderItemService.getOrderItemByOrderItemId(orderItemId);
        if (orderItemDto != null) {
            response.setCodeAndMessageAndDataByEnum(GhResponseEnum.SUCCESS, orderItemDto);
        }
        log.info("getOrderItemByOrderItemId===>{}", response);
        return response;
    }

    @GetMapping("/Item/order/{orderId}/{pageNum}/{pageSize}")
    public GhResponse listOrderItemByOrderId(@PathVariable("orderId") int orderId, @PathVariable("pageNum") int pageNum,
                                             @PathVariable("pageSize") int pageSize) {
        GhResponse<PageInfo<OrderItemDto>> response = new GhResponse<>(GhResponseEnum.FAIL);
        PageInfo<OrderItemDto> pageInfo = orderItemService.listOrderItemByUserId(orderId, pageNum, pageSize);
        if (pageInfo != null) {
            response.setCodeAndMessageAndDataByEnum(GhResponseEnum.SUCCESS, pageInfo);
        }
        log.info("listOrderItemByOrderId===>{}", response);
        return response;
    }

    @GetMapping("/Item/user/{userId}/{pageNum}/{pageSize}")
    public GhResponse listOrderItemByUserId(@PathVariable("userId") int userId, @PathVariable("pageNum") int pageNum,
                                            @PathVariable("pageSize") int pageSize) {
        GhResponse<PageInfo<OrderItemDto>> response = new GhResponse<>(GhResponseEnum.FAIL);
        PageInfo<OrderItemDto> pageInfo = orderItemService.listOrderItemByUserId(userId, pageNum, pageSize);
        if (pageInfo != null) {
            response.setCodeAndMessageAndDataByEnum(GhResponseEnum.SUCCESS, pageInfo);
        }
        log.info("listOrderItemByUserId===>{}", response);
        return response;
    }

}
