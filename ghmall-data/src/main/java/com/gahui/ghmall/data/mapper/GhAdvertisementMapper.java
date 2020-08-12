package com.gahui.ghmall.data.mapper;

import com.gahui.ghmall.data.entity.GhAdvertisement;
import com.gahui.ghmall.data.entity.GhAdvertisementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhAdvertisementMapper {
    long countByExample(GhAdvertisementExample example);

    int deleteByExample(GhAdvertisementExample example);

    int deleteByPrimaryKey(Integer advertisementId);

    int insert(GhAdvertisement record);

    int insertSelective(GhAdvertisement record);

    List<GhAdvertisement> selectByExample(GhAdvertisementExample example);

    GhAdvertisement selectByPrimaryKey(Integer advertisementId);

    int updateByExampleSelective(@Param("record") GhAdvertisement record, @Param("example") GhAdvertisementExample example);

    int updateByExample(@Param("record") GhAdvertisement record, @Param("example") GhAdvertisementExample example);

    int updateByPrimaryKeySelective(GhAdvertisement record);

    int updateByPrimaryKey(GhAdvertisement record);
}