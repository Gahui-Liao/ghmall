package com.gahui.ghmall.data.service;

import com.gahui.ghmall.data.dto.CategoryDto;

import java.util.List;

/**
 * @description: 类目相关业务
 * @author: liaojiaxi
 * @date: 2020/8/7
 **/
public interface CategoryService {
    List<CategoryDto> listCategoryByCategoryIdAsc();
}
