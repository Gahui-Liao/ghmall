package com.gahui.ghmall.data.mapper;

import com.gahui.ghmall.data.entity.GhComment;
import com.gahui.ghmall.data.entity.GhCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhCommentMapper {
    long countByExample(GhCommentExample example);

    int deleteByExample(GhCommentExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(GhComment record);

    int insertSelective(GhComment record);

    List<GhComment> selectByExample(GhCommentExample example);

    GhComment selectByPrimaryKey(Integer commentId);

    int updateByExampleSelective(@Param("record") GhComment record, @Param("example") GhCommentExample example);

    int updateByExample(@Param("record") GhComment record, @Param("example") GhCommentExample example);

    int updateByPrimaryKeySelective(GhComment record);

    int updateByPrimaryKey(GhComment record);
}