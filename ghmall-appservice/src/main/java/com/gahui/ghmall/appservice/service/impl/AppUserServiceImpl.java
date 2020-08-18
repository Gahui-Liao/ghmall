package com.gahui.ghmall.appservice.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.gahui.ghmall.appservice.service.AppUserService;
import com.gahui.ghmall.appservice.service.TokenService;
import com.gahui.ghmall.appservice.vo.AppUserInfoVo;
import com.gahui.ghmall.comm.constant.Constant;
import com.gahui.ghmall.comm.util.GhHttpUtil;
import com.gahui.ghmall.data.dto.UserDto;
import com.gahui.ghmall.data.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/15
 **/
@Service("appUserService")
public class AppUserServiceImpl implements AppUserService {

    @Resource
    TokenService tokenService;

    @Resource
    UserService userService;

    @Value("${weChat.getUserInfoUrl}")
    private String weChatUserInfoUrl;

    @Value("${weChat.appId}")
    private String appid;

    @Value("${weChat.appSecret}")
    private String secret;

    @Value("${weChat.grantType}")
    private String grantType;

    @Override
    public String loginByWeChat(AppUserInfoVo userInfo) {
        String openid = this.getWxOpenid(userInfo.getCode());
        if (StringUtils.isEmpty(openid)) {
            return null;
        }
        UserDto userDto = null;
        // 从数据库中获取用户信息
        if (!StringUtils.isEmpty(openid)) {
            userDto = userService.getUserByWetChatOpenId(openid);
        }
        // 如为第一次登录，保存用户信息
        if (userDto == null) {
            this.registerNewUser(userInfo, openid);
        }
        return tokenService.getToken(openid);
    }

    private String getWxOpenid(String jsCode) {
        HashMap<String, String> params = new HashMap<>(16);
        params.put("appid", appid);
        params.put("secret", secret);
        params.put("grant_type", grantType);
        params.put("js_code", jsCode);
        JSONObject wxResponse = GhHttpUtil.get(weChatUserInfoUrl, null, params);

        String reqCode = "200";
        if (reqCode.equals(wxResponse.getString(Constant.RSP_CODE))) {
            JSONObject body = (JSONObject) wxResponse.get(Constant.RSP_BODY);
            String openId = body.getString("openid");
            if (!StringUtils.isEmpty(openId)) {
                return openId;
            }
        }
        return null;
    }

    private void registerNewUser(AppUserInfoVo userInfo, String openId) {
        UserDto user = new UserDto();
        user.setUserNickName(userInfo.getNickName());
        user.setWechatAvatar(userInfo.getAvatarUrl());
        user.setWechatOpenid(openId);
        userService.insertUser(user);
    }
}
