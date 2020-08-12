package com.gahui.ghmall.data.mapper;

import com.gahui.ghmall.data.entity.GhAddress;
import com.gahui.ghmall.data.entity.GhAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhAddressMapper {
    long countByExample(GhAddressExample example);

    int deleteByExample(GhAddressExample example);

    int deleteByPrimaryKey(Integer addressId);

    int insert(GhAddress record);

    int insertSelective(GhAddress record);

    List<GhAddress> selectByExample(GhAddressExample example);

    GhAddress selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") GhAddress record, @Param("example") GhAddressExample example);

    int updateByExample(@Param("record") GhAddress record, @Param("example") GhAddressExample example);

    int updateByPrimaryKeySelective(GhAddress record);

    int updateByPrimaryKey(GhAddress record);
}