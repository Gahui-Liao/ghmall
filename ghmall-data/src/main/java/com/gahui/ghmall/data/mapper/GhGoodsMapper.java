package com.gahui.ghmall.data.mapper;

import com.gahui.ghmall.data.entity.GhGoods;
import com.gahui.ghmall.data.entity.GhGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhGoodsMapper {
    long countByExample(GhGoodsExample example);

    int deleteByExample(GhGoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(GhGoods record);

    int insertSelective(GhGoods record);

    List<GhGoods> selectByExample(GhGoodsExample example);

    GhGoods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") GhGoods record, @Param("example") GhGoodsExample example);

    int updateByExample(@Param("record") GhGoods record, @Param("example") GhGoodsExample example);

    int updateByPrimaryKeySelective(GhGoods record);

    int updateByPrimaryKey(GhGoods record);
}