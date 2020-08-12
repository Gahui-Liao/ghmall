package com.gahui.ghmall.data.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/4
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class UserDto extends BaseDto {
    private Integer userId;

    private String userCode;

    private String userNickName;

    private String userBrief;

    private String userMobile;

    private String userName;

    private String userPassword;

    private String wechatOpenid;

    private String wechatAvatar;
}
