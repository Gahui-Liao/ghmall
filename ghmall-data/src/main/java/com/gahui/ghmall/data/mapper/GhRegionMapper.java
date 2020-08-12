package com.gahui.ghmall.data.mapper;

import com.gahui.ghmall.data.entity.GhRegion;
import com.gahui.ghmall.data.entity.GhRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhRegionMapper {
    long countByExample(GhRegionExample example);

    int deleteByExample(GhRegionExample example);

    int deleteByPrimaryKey(Integer regionId);

    int insert(GhRegion record);

    int insertSelective(GhRegion record);

    List<GhRegion> selectByExample(GhRegionExample example);

    GhRegion selectByPrimaryKey(Integer regionId);

    int updateByExampleSelective(@Param("record") GhRegion record, @Param("example") GhRegionExample example);

    int updateByExample(@Param("record") GhRegion record, @Param("example") GhRegionExample example);

    int updateByPrimaryKeySelective(GhRegion record);

    int updateByPrimaryKey(GhRegion record);
}