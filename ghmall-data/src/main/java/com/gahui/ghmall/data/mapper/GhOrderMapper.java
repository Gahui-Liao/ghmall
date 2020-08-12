package com.gahui.ghmall.data.mapper;

import com.gahui.ghmall.data.entity.GhOrder;
import com.gahui.ghmall.data.entity.GhOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhOrderMapper {
    long countByExample(GhOrderExample example);

    int deleteByExample(GhOrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(GhOrder record);

    int insertSelective(GhOrder record);

    List<GhOrder> selectByExample(GhOrderExample example);

    GhOrder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") GhOrder record, @Param("example") GhOrderExample example);

    int updateByExample(@Param("record") GhOrder record, @Param("example") GhOrderExample example);

    int updateByPrimaryKeySelective(GhOrder record);

    int updateByPrimaryKey(GhOrder record);
}