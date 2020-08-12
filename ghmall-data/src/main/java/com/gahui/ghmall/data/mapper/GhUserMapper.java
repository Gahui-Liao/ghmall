package com.gahui.ghmall.data.mapper;

import com.gahui.ghmall.data.entity.GhUser;
import com.gahui.ghmall.data.entity.GhUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhUserMapper {
    long countByExample(GhUserExample example);

    int deleteByExample(GhUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(GhUser record);

    int insertSelective(GhUser record);

    List<GhUser> selectByExample(GhUserExample example);

    GhUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") GhUser record, @Param("example") GhUserExample example);

    int updateByExample(@Param("record") GhUser record, @Param("example") GhUserExample example);

    int updateByPrimaryKeySelective(GhUser record);

    int updateByPrimaryKey(GhUser record);
}