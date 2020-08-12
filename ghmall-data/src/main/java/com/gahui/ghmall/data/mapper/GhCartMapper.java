package com.gahui.ghmall.data.mapper;

import com.gahui.ghmall.data.entity.GhCart;
import com.gahui.ghmall.data.entity.GhCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhCartMapper {
    long countByExample(GhCartExample example);

    int deleteByExample(GhCartExample example);

    int deleteByPrimaryKey(Integer cartId);

    int insert(GhCart record);

    int insertSelective(GhCart record);

    List<GhCart> selectByExample(GhCartExample example);

    GhCart selectByPrimaryKey(Integer cartId);

    int updateByExampleSelective(@Param("record") GhCart record, @Param("example") GhCartExample example);

    int updateByExample(@Param("record") GhCart record, @Param("example") GhCartExample example);

    int updateByPrimaryKeySelective(GhCart record);

    int updateByPrimaryKey(GhCart record);
}