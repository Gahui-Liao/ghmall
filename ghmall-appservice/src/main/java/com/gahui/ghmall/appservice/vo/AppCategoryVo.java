package com.gahui.ghmall.appservice.vo;

import com.gahui.ghmall.data.dto.CategoryDto;
import com.gahui.ghmall.data.dto.GoodsDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/5
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class AppCategoryVo extends BaseVo {

    /**
     * 全部商品
     */
    List<GoodsDto> allGoods;

    /**
     * 分类后全部商品
     */
    List<CategoryDto> categorys;
}
