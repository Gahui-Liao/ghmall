package com.gahui.ghmall.appservice.controller;

import com.gahui.ghmall.comm.en.GhResponseEnum;
import com.gahui.ghmall.comm.vo.GhResponse;
import com.gahui.ghmall.data.dto.AdvertisementDto;
import com.gahui.ghmall.data.service.AdvertisementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/7
 **/
@Slf4j
@RestController
@RequestMapping("/advertisement")
public class AppAdvertisementController {

    @Resource
    AdvertisementService advertisementService;

    @GetMapping("/list")
    public GhResponse listNoticeBySeqDesc() {
        GhResponse<List<AdvertisementDto>> response = new GhResponse<>(GhResponseEnum.FAIL);
        List<AdvertisementDto> advertisementDtos = advertisementService.listAdvertisementBySeqDesc();
        if (advertisementDtos != null) {
            response.setCodeAndMessageAndDataByEnum(GhResponseEnum.SUCCESS, advertisementDtos);
        }
        log.info("listNoticeBySeqDesc===>{}", response);
        return response;
    }

}
