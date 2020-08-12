package com.gahui.ghmall.appservice.controller;

import com.gahui.ghmall.comm.en.GhResponseEnum;
import com.gahui.ghmall.comm.vo.GhResponse;
import com.gahui.ghmall.data.dto.NoticeDto;
import com.gahui.ghmall.data.service.NoticeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 通知类相关接口
 * @author: liaojiaxi
 * @date: 2020/8/7
 **/
@Slf4j
@RestController
@RequestMapping("/notice")
public class AppNoticeController {

    @Resource
    NoticeService noticeService;

    @GetMapping("/list")
    public GhResponse listNoticeBySeqDesc(){
        GhResponse<List<NoticeDto>> response = new GhResponse<>(GhResponseEnum.FAIL);
        List<NoticeDto> noticeDtos = noticeService.listNoticeBySeqDesc();
        if (noticeDtos != null && noticeDtos.size() > 0) {
            response.setCodeAndMessageAndDataByEnum(GhResponseEnum.SUCCESS, noticeDtos);
        }
        log.info("listNoticeBySeqDesc===>{}", response);
        return response;
    }

}
