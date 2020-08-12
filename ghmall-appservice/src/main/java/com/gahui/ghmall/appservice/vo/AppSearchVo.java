package com.gahui.ghmall.appservice.vo;

import com.gahui.ghmall.data.dto.GoodsDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/6
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class AppSearchVo extends BaseVo {
    /**
     * 搜索结果的商品集合
     */
    List<GoodsDto> allGoods;
}
