package com.gahui.ghmall.data.service.impl;

import com.gahui.ghmall.comm.constant.Constant;
import com.gahui.ghmall.comm.util.GhCopyUtil;
import com.gahui.ghmall.data.dto.NoticeDto;
import com.gahui.ghmall.data.entity.GhNoticeExample;
import com.gahui.ghmall.data.mapper.GhNoticeMapper;
import com.gahui.ghmall.data.service.NoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/6
 **/
@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

    @Resource
    GhNoticeMapper noticeMapper;

    @Override
    public List<NoticeDto> listNoticeBySeqDesc() {
        GhNoticeExample example = new GhNoticeExample();
        example.createCriteria().andStatusEqualTo(Constant.STATUS_EFF);
        example.setOrderByClause(Constant.NOTICE_ORDER_BY_SEQ_DESC);
        return GhCopyUtil.copyListProperties(noticeMapper.selectByExample(example),NoticeDto.class);
    }
}
