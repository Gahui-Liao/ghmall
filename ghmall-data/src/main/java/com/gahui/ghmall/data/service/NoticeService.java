package com.gahui.ghmall.data.service;

import com.gahui.ghmall.data.dto.NoticeDto;

import java.util.List;

/**
 * @description: 通知相关业务
 * @author: liaojiaxi
 * @date: 2020/8/6
 **/
public interface NoticeService {

    List<NoticeDto> listNoticeBySeqDesc();
}
