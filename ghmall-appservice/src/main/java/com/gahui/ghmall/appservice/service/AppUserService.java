package com.gahui.ghmall.appservice.service;

import com.gahui.ghmall.appservice.vo.AppUserInfoVo;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/15
 **/
public interface AppUserService {

    String loginByWeChat(AppUserInfoVo userInfo);
}
