package com.gahui.ghmall.data.mapper;

import com.gahui.ghmall.data.entity.GhGoodsImg;
import com.gahui.ghmall.data.entity.GhGoodsImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhGoodsImgMapper {
    long countByExample(GhGoodsImgExample example);

    int deleteByExample(GhGoodsImgExample example);

    int deleteByPrimaryKey(Integer goodsImgId);

    int insert(GhGoodsImg record);

    int insertSelective(GhGoodsImg record);

    List<GhGoodsImg> selectByExample(GhGoodsImgExample example);

    GhGoodsImg selectByPrimaryKey(Integer goodsImgId);

    int updateByExampleSelective(@Param("record") GhGoodsImg record, @Param("example") GhGoodsImgExample example);

    int updateByExample(@Param("record") GhGoodsImg record, @Param("example") GhGoodsImgExample example);

    int updateByPrimaryKeySelective(GhGoodsImg record);

    int updateByPrimaryKey(GhGoodsImg record);
}