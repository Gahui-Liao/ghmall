package com.gahui.ghmall.appservice.controller;

import com.gahui.ghmall.comm.annotation.AuthRequired;
import com.gahui.ghmall.comm.en.GhResponseEnum;
import com.gahui.ghmall.comm.vo.GhResponse;
import com.gahui.ghmall.data.dto.GoodsDto;
import com.gahui.ghmall.data.service.GoodsService;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @description: 商品相关接口
 * @author: liaojiaxi
 * @date: 2020/8/7
 **/
@Slf4j
@RestController
@RequestMapping("/goods")
public class AppGoodsController {

    @Resource
    GoodsService goodsService;

    @AuthRequired
    @GetMapping("/id/{goodsId}")
    public GhResponse getGoodsByGoodsId(@PathVariable("goodsId") int goodsId) {
        GhResponse<GoodsDto> response = new GhResponse<>(GhResponseEnum.FAIL);
        GoodsDto goodsDto = goodsService.getGoodsByGoodsId(goodsId);
        if (goodsDto != null) {
            response.setCodeAndMessageAndDataByEnum(GhResponseEnum.SUCCESS, goodsDto);
        }
        log.info("getGoodsByGoodsId===>{}", response);
        return response;
    }

    @GetMapping("/page/{categoryId}/{pageNum}/{pageSize}")
    public GhResponse listGoodsByCategoryId(@PathVariable("categoryId") int categoryId, @PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        GhResponse<PageInfo<GoodsDto>> response = new GhResponse<>(GhResponseEnum.FAIL);
        PageInfo<GoodsDto> pageInfo = goodsService.listGoodsByCategoryId(categoryId, pageNum, pageSize);
        if (pageInfo != null) {
            response.setCodeAndMessageAndDataByEnum(GhResponseEnum.SUCCESS, pageInfo);
        }
        log.info("listGoodsByCategoryId===>{}", response);
        return response;
    }

    @GetMapping("/page/new/{pageNum}/{pageSize}")
    public GhResponse listGoodsByCreateTimeDesc(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        GhResponse<PageInfo<GoodsDto>> response = new GhResponse<>(GhResponseEnum.FAIL);
        PageInfo<GoodsDto> pageInfo = goodsService.listGoodsByCreateTimeDesc(pageNum, pageSize);
        if (pageInfo != null) {
            response.setCodeAndMessageAndDataByEnum(GhResponseEnum.SUCCESS, pageInfo);
        }
        log.info("listGoodsByCreateTimeDesc===>{}", response);
        return response;
    }

    @GetMapping("/page/sellWell/{pageNum}/{pageSize}")
    public GhResponse listGoodsBySellNumDesc(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        GhResponse<PageInfo<GoodsDto>> response = new GhResponse<>(GhResponseEnum.FAIL);
        PageInfo<GoodsDto> pageInfo = goodsService.listGoodsBySellNumDesc(pageNum, pageSize);
        if (pageInfo != null) {
            response.setCodeAndMessageAndDataByEnum(GhResponseEnum.SUCCESS, pageInfo);
        }
        log.info("listGoodsBySellNumDesc===>{}", response);
        return response;
    }

    @GetMapping("/page/search/{pageNum}/{pageSize}")
    public GhResponse listGoodsByBrief(@RequestParam("brief") String brief, @PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        GhResponse<PageInfo<GoodsDto>> response = new GhResponse<>(GhResponseEnum.FAIL);
        PageInfo<GoodsDto> pageInfo = goodsService.listGoodsByBrief(brief, pageNum, pageSize);
        if (pageInfo != null) {
            response.setCodeAndMessageAndDataByEnum(GhResponseEnum.SUCCESS, pageInfo);
        }
        log.info("listGoodsByBrief===>{}", response);
        return response;
    }


    @GetMapping("/page/{pageNum}/{pageSize}")
    public GhResponse listGoods(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        GhResponse<PageInfo<GoodsDto>> response = new GhResponse<>(GhResponseEnum.FAIL);
        PageInfo<GoodsDto> pageInfo = goodsService.listGoods(pageNum, pageSize);
        if (pageInfo != null) {
            response.setCodeAndMessageAndDataByEnum(GhResponseEnum.SUCCESS, pageInfo);
        }
        log.info("listGoods===>{}", response);
        return response;
    }


}
