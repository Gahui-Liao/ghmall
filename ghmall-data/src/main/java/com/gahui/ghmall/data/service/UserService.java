package com.gahui.ghmall.data.service;

import com.gahui.ghmall.data.dto.UserDto;

/**
 * @description: 用户相关业务
 * @author: liaojiaxi
 * @date: 2020/8/10
 **/
public interface UserService {

    UserDto getUserByWetChatOpenId(String weChatOpenId);

    int insertUser(UserDto userDto);

    UserDto getUserByUserId(int userId);
}
