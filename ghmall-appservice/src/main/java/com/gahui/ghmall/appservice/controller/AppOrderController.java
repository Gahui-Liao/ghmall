package com.gahui.ghmall.appservice.controller;

import com.gahui.ghmall.comm.en.GhResponseEnum;
import com.gahui.ghmall.comm.vo.GhResponse;
import com.gahui.ghmall.data.dto.OrderDto;
import com.gahui.ghmall.data.service.OrderService;
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

    @GetMapping("/id/{orderId}")
    public GhResponse getOrderByOrderId(@PathVariable("orderId") int orderId){
        GhResponse<OrderDto> response = new GhResponse<>(GhResponseEnum.FAIL);
        OrderDto orderDto = orderService.getOrderByOrderId(orderId);
        if (orderDto != null && orderDto.getOrderId() != null) {
            response.setCodeAndMessageAndDataByEnum(GhResponseEnum.SUCCESS, orderDto);
        }
        log.info("getOrderByOrderId===>{}", response);
        return response;
    }


}
