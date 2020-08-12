package com.gahui.ghmall.data.mapper;

import com.gahui.ghmall.data.entity.GhOrderItem;
import com.gahui.ghmall.data.entity.GhOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhOrderItemMapper {
    long countByExample(GhOrderItemExample example);

    int deleteByExample(GhOrderItemExample example);

    int deleteByPrimaryKey(Integer orderItemId);

    int insert(GhOrderItem record);

    int insertSelective(GhOrderItem record);

    List<GhOrderItem> selectByExample(GhOrderItemExample example);

    GhOrderItem selectByPrimaryKey(Integer orderItemId);

    int updateByExampleSelective(@Param("record") GhOrderItem record, @Param("example") GhOrderItemExample example);

    int updateByExample(@Param("record") GhOrderItem record, @Param("example") GhOrderItemExample example);

    int updateByPrimaryKeySelective(GhOrderItem record);

    int updateByPrimaryKey(GhOrderItem record);
}