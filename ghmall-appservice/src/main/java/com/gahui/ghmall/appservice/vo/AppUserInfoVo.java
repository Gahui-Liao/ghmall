package com.gahui.ghmall.appservice.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description: 微信用户信息，
 * 详见：https://developers.weixin.qq.com/miniprogram/dev/api/open-api/user-info/UserInfo.html
 * @author: liaojiaxi
 * @date: 2020/8/15
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class AppUserInfoVo extends BaseVo {
    private String code;

    private String nickName;

    private String avatarUrl;

    private Byte gender;

    private String country;

    private String province;

    private String city;

    private String language;
}
