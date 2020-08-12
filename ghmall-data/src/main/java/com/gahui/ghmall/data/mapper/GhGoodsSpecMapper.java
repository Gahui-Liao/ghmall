package com.gahui.ghmall.data.mapper;

import com.gahui.ghmall.data.entity.GhGoodsSpec;
import com.gahui.ghmall.data.entity.GhGoodsSpecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhGoodsSpecMapper {
    long countByExample(GhGoodsSpecExample example);

    int deleteByExample(GhGoodsSpecExample example);

    int deleteByPrimaryKey(Integer goodsSpecId);

    int insert(GhGoodsSpec record);

    int insertSelective(GhGoodsSpec record);

    List<GhGoodsSpec> selectByExample(GhGoodsSpecExample example);

    GhGoodsSpec selectByPrimaryKey(Integer goodsSpecId);

    int updateByExampleSelective(@Param("record") GhGoodsSpec record, @Param("example") GhGoodsSpecExample example);

    int updateByExample(@Param("record") GhGoodsSpec record, @Param("example") GhGoodsSpecExample example);

    int updateByPrimaryKeySelective(GhGoodsSpec record);

    int updateByPrimaryKey(GhGoodsSpec record);
}