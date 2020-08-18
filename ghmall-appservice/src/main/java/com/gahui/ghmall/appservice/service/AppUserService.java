package com.gahui.ghmall.appservice.service;

import com.gahui.ghmall.appservice.vo.AppLoginResponseVo;
import com.gahui.ghmall.appservice.vo.AppUserInfoVo;
import com.gahui.ghmall.data.dto.UserDto;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/15
 **/
public interface AppUserService {

    AppLoginResponseVo loginByWeChat(AppUserInfoVo userInfo);

    UserDto getUserByUserId(int userId);
}
