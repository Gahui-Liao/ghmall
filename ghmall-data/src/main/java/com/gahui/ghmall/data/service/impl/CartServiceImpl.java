package com.gahui.ghmall.data.service.impl;

import com.gahui.ghmall.comm.constant.Constant;
import com.gahui.ghmall.comm.util.GhCopyUtil;
import com.gahui.ghmall.data.dto.CartDto;
import com.gahui.ghmall.data.entity.GhCartExample;
import com.gahui.ghmall.data.mapper.GhCartMapper;
import com.gahui.ghmall.data.service.CartService;
import com.gahui.ghmall.data.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 购物车相关业务
 * @author: liaojiaxi
 * @date: 2020/8/11
 **/
@Service("cartService")
public class CartServiceImpl implements CartService {

    @Resource
    GhCartMapper cartMapper;

    @Resource
    GoodsService goodsService;

    @Override
    public int getCartNumByUserId(int userId) {
        GhCartExample example = new GhCartExample();
        example.createCriteria().andUserIdEqualTo(userId).andStatusEqualTo(Constant.STATUS_EFF);
        return cartMapper.selectByExample(example).size();
    }

    @Override
    public PageInfo<CartDto> listCartByUserId(int userId, int pageNum, int pageSize) {
        GhCartExample example = new GhCartExample();
        example.createCriteria().andUserIdEqualTo(userId).andStatusEqualTo(Constant.STATUS_EFF);
        return this.listCartByCartExample(example, pageNum, pageSize);

    }

    @Override
    public int deleteCartByUserIdAndCartId(int userId, int goodsId) {
        GhCartExample example = new GhCartExample();
        example.createCriteria().andUserIdEqualTo(userId).andGoodsIdEqualTo(goodsId).andStatusEqualTo(Constant.STATUS_EFF);
        return cartMapper.deleteByExample(example);
    }

    private PageInfo<CartDto> listCartByCartExample(GhCartExample example, int pageNum, int pageSize) {
        pageNum = pageNum > Constant.PAGE_NUM_LIMIT ? Constant.PAGE_NUM_LIMIT : pageNum;
        pageSize = pageSize > Constant.PAGE_SIZE_LIMIT ? Constant.PAGE_SIZE_LIMIT : pageSize;
        PageHelper.startPage(pageNum, pageSize);
        List<CartDto> cartDtos = GhCopyUtil.copyListProperties(cartMapper.selectByExample(example), CartDto.class);
        if (cartDtos != null) {
            for (CartDto temp : cartDtos) {
                int goodsId = temp.getGoodsId();
                temp.setGoods(goodsService.getGoodsByGoodsId(goodsId));
            }
        } else {
            return null;
        }
        return new PageInfo<>(cartDtos);
    }
}
