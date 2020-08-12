package com.gahui.ghmall.data.mapper;

import com.gahui.ghmall.data.entity.GhDelivery;
import com.gahui.ghmall.data.entity.GhDeliveryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhDeliveryMapper {
    long countByExample(GhDeliveryExample example);

    int deleteByExample(GhDeliveryExample example);

    int deleteByPrimaryKey(Integer deliveryId);

    int insert(GhDelivery record);

    int insertSelective(GhDelivery record);

    List<GhDelivery> selectByExample(GhDeliveryExample example);

    GhDelivery selectByPrimaryKey(Integer deliveryId);

    int updateByExampleSelective(@Param("record") GhDelivery record, @Param("example") GhDeliveryExample example);

    int updateByExample(@Param("record") GhDelivery record, @Param("example") GhDeliveryExample example);

    int updateByPrimaryKeySelective(GhDelivery record);

    int updateByPrimaryKey(GhDelivery record);
}