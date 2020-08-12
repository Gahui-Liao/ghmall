package com.gahui.ghmall.data.service.impl;

import com.gahui.ghmall.comm.constant.Constant;
import com.gahui.ghmall.comm.util.GhCopyUtil;
import com.gahui.ghmall.data.dto.CategoryDto;
import com.gahui.ghmall.data.entity.GhCategoryExample;
import com.gahui.ghmall.data.mapper.GhCategoryMapper;
import com.gahui.ghmall.data.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/7
 **/
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Resource
    GhCategoryMapper categoryMapper;

    @Override
    public List<CategoryDto> listCategoryByCategoryIdAsc() {
        GhCategoryExample example = new GhCategoryExample();
        example.createCriteria().andStatusEqualTo(Constant.STATUS_EFF);
        example.setOrderByClause(Constant.CATEGORY_ORDER_BY_ID_ASC);
        return GhCopyUtil.copyListProperties(categoryMapper.selectByExample(example),CategoryDto.class);
    }
}
