package com.gahui.ghmall.data.mapper;

import com.gahui.ghmall.data.entity.GhCategory;
import com.gahui.ghmall.data.entity.GhCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhCategoryMapper {
    long countByExample(GhCategoryExample example);

    int deleteByExample(GhCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(GhCategory record);

    int insertSelective(GhCategory record);

    List<GhCategory> selectByExample(GhCategoryExample example);

    GhCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") GhCategory record, @Param("example") GhCategoryExample example);

    int updateByExample(@Param("record") GhCategory record, @Param("example") GhCategoryExample example);

    int updateByPrimaryKeySelective(GhCategory record);

    int updateByPrimaryKey(GhCategory record);
}