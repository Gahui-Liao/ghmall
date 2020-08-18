package com.gahui.ghmall.appservice.controller;

import com.gahui.ghmall.appservice.service.AppUserService;
import com.gahui.ghmall.appservice.vo.AppUserInfoVo;
import com.gahui.ghmall.comm.en.GhResponseEnum;
import com.gahui.ghmall.comm.vo.GhResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: 用户相关接口
 * @author: liaojiaxi
 * @date: 2020/8/15
 **/
@Slf4j
@RestController
@RequestMapping("/user")
public class AppUserController {

    @Resource
    AppUserService appUserService;

    @PostMapping("/login/wechat")
    public GhResponse loginByWeChat(@RequestBody AppUserInfoVo userInfo) {
        GhResponse<String> response = new GhResponse<>(GhResponseEnum.FAIL);
        log.info("userinfo===>{}", userInfo);
        String token = appUserService.loginByWeChat(null);
        if (!StringUtils.isEmpty(token)) {
            response.setCodeAndMessageAndDataByEnum(GhResponseEnum.SUCCESS, token);
        }
        log.info("loginByWeChat**token**===>{}", response);
        return response;
    }
}
