package com.gahui.ghmall.appservice.service;

import com.gahui.ghmall.data.dto.UserDto;

import java.util.Map;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/10
 **/
public interface TokenService {

    /**
     * 生成token
     * @param wxOpenId
     * @return
     */
    String getToken(String wxOpenId);

    /**
     * 解析token
     * @param token
     * @return
     */
    Map verifyToken(String token);
}
