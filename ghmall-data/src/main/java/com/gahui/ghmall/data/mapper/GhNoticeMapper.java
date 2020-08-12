package com.gahui.ghmall.data.mapper;

import com.gahui.ghmall.data.entity.GhNotice;
import com.gahui.ghmall.data.entity.GhNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhNoticeMapper {
    long countByExample(GhNoticeExample example);

    int deleteByExample(GhNoticeExample example);

    int deleteByPrimaryKey(Integer noticeId);

    int insert(GhNotice record);

    int insertSelective(GhNotice record);

    List<GhNotice> selectByExample(GhNoticeExample example);

    GhNotice selectByPrimaryKey(Integer noticeId);

    int updateByExampleSelective(@Param("record") GhNotice record, @Param("example") GhNoticeExample example);

    int updateByExample(@Param("record") GhNotice record, @Param("example") GhNoticeExample example);

    int updateByPrimaryKeySelective(GhNotice record);

    int updateByPrimaryKey(GhNotice record);
}