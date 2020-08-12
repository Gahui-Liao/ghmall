package com.gahui.ghmall.data.service.impl;

import com.gahui.ghmall.comm.constant.Constant;
import com.gahui.ghmall.comm.util.GhCopyUtil;
import com.gahui.ghmall.data.dto.GoodsDto;
import com.gahui.ghmall.data.dto.GoodsGalleryDto;
import com.gahui.ghmall.data.dto.GoodsImgDto;
import com.gahui.ghmall.data.dto.GoodsSpecDto;
import com.gahui.ghmall.data.entity.*;
import com.gahui.ghmall.data.mapper.GhGoodsGalleryMapper;
import com.gahui.ghmall.data.mapper.GhGoodsImgMapper;
import com.gahui.ghmall.data.mapper.GhGoodsMapper;
import com.gahui.ghmall.data.mapper.GhGoodsSpecMapper;
import com.gahui.ghmall.data.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 商品业务层
 * @author: liaojiaxi
 * @date: 2020/8/5
 **/
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

    @Resource
    GhGoodsMapper goodsMapper;

    @Resource
    GhGoodsImgMapper goodsImgMapper;

    @Resource
    GhGoodsSpecMapper goodsSpecMapper;

    @Resource
    GhGoodsGalleryMapper goodsGalleryMapper;

    @Override
    public GoodsDto getGoodsByGoodsId(int goodsId) {
        GhGoodsExample goodsExample = new GhGoodsExample();
        goodsExample.createCriteria().andGoodsIdEqualTo(goodsId).andStatusEqualTo(Constant.STATUS_EFF);
        GhGoods goods = new GhGoods();
        List<GhGoods> selectGoods = goodsMapper.selectByExample(goodsExample);
        if(selectGoods != null){
            goods = selectGoods.get(0);
        }
        GoodsDto goodsDto = GhCopyUtil.copyProperties(goods, GoodsDto.class);
        if (goodsDto != null) {
            this.buildGoodsDto(goodsDto);
        }
        return goodsDto;
    }

    @Override
    public PageInfo<GoodsDto> listGoodsByCategoryId(int categoryId, int pageNum, int pageSize) {
        GhGoodsExample example = new GhGoodsExample();
        example.createCriteria().andCategoryIdEqualTo(categoryId).andStatusEqualTo(Constant.STATUS_EFF);
        return  this.listGoodsByGoodsExample(example,pageNum,pageSize);
    }

    @Override
    public PageInfo<GoodsDto> listGoodsByCreateTimeDesc(int pageNum, int pageSize) {
        GhGoodsExample example = new GhGoodsExample();
        example.createCriteria().andStatusEqualTo(Constant.STATUS_EFF);
        example.setOrderByClause(Constant.GOODS_ORDER_BY_CREATE_TIME_DESC);
        return  this.listGoodsByGoodsExample(example,pageNum,pageSize);
    }

    @Override
    public PageInfo<GoodsDto> listGoodsBySellNumDesc(int pageNum, int pageSize) {
        GhGoodsExample example = new GhGoodsExample();
        example.createCriteria().andStatusEqualTo(Constant.STATUS_EFF);
        example.setOrderByClause(Constant.GOODS_ORDER_BY_SELL_NUM_DESC);
        return  this.listGoodsByGoodsExample(example,pageNum,pageSize);
    }

    @Override
    public PageInfo<GoodsDto> listGoodsByBrief(String goodsBrief, int pageNum, int pageSize) {
        GhGoodsExample example = new GhGoodsExample();
        example.createCriteria().andGoodsBriefLike(goodsBrief).andStatusEqualTo(Constant.STATUS_EFF);
        return  this.listGoodsByGoodsExample(example,pageNum,pageSize);
    }

    @Override
    public PageInfo<GoodsDto> listGoods(int pageNum, int pageSize) {
        GhGoodsExample example = new GhGoodsExample();
        example.createCriteria().andStatusEqualTo(Constant.STATUS_EFF);
        return  this.listGoodsByGoodsExample(example,pageNum,pageSize);
    }


    private PageInfo<GoodsDto> listGoodsByGoodsExample(GhGoodsExample example, int pageNum, int pageSize) {
        pageNum = pageNum > Constant.PAGE_NUM_LIMIT ? Constant.PAGE_NUM_LIMIT : pageNum;
        pageSize = pageSize > Constant.PAGE_SIZE_LIMIT ? Constant.PAGE_SIZE_LIMIT : pageSize;
        PageHelper.startPage(pageNum, pageSize);
        List<GoodsDto> goodsDtos = GhCopyUtil.copyListProperties(goodsMapper.selectByExample(example), GoodsDto.class);
        if (goodsDtos != null) {
            for (GoodsDto temp : goodsDtos) {
                buildGoodsDto(temp);
            }
        } else {
            return null;
        }
        return new PageInfo<>(goodsDtos);
    }

    private void buildGoodsDto(GoodsDto goodsDto) {
        GhGoodsImgExample goodsImgExample = new GhGoodsImgExample();
        goodsImgExample.createCriteria().andGoodsIdEqualTo(goodsDto.getGoodsId()).andStatusEqualTo(Constant.STATUS_EFF);
        goodsDto.setGoodsImgs(GhCopyUtil.copyListProperties(goodsImgMapper.selectByExample(goodsImgExample), GoodsImgDto.class));
        GhGoodsSpecExample goodsSpecExample = new GhGoodsSpecExample();
        goodsSpecExample.createCriteria().andGoodsIdEqualTo(goodsDto.getGoodsId()).andStatusEqualTo(Constant.STATUS_EFF);
        goodsDto.setGoodsSpecs(GhCopyUtil.copyListProperties(goodsSpecMapper.selectByExample(goodsSpecExample), GoodsSpecDto.class));
        GhGoodsGalleryExample goodsGalleryExample = new GhGoodsGalleryExample();
        goodsGalleryExample.createCriteria().andGoodsIdEqualTo(goodsDto.getGoodsId()).andStatusEqualTo(Constant.STATUS_EFF);
        goodsDto.setGoodsGallerys(GhCopyUtil.copyListProperties(goodsGalleryMapper.selectByExample(goodsGalleryExample), GoodsGalleryDto.class));
    }
}
