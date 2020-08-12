package com.gahui.ghmall.data.mapper;

import com.gahui.ghmall.data.entity.GhGoodsGallery;
import com.gahui.ghmall.data.entity.GhGoodsGalleryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhGoodsGalleryMapper {
    long countByExample(GhGoodsGalleryExample example);

    int deleteByExample(GhGoodsGalleryExample example);

    int deleteByPrimaryKey(Integer goodsGalleryId);

    int insert(GhGoodsGallery record);

    int insertSelective(GhGoodsGallery record);

    List<GhGoodsGallery> selectByExample(GhGoodsGalleryExample example);

    GhGoodsGallery selectByPrimaryKey(Integer goodsGalleryId);

    int updateByExampleSelective(@Param("record") GhGoodsGallery record, @Param("example") GhGoodsGalleryExample example);

    int updateByExample(@Param("record") GhGoodsGallery record, @Param("example") GhGoodsGalleryExample example);

    int updateByPrimaryKeySelective(GhGoodsGallery record);

    int updateByPrimaryKey(GhGoodsGallery record);
}