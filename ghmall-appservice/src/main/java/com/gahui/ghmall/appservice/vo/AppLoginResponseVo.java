package com.gahui.ghmall.appservice.vo;

import com.gahui.ghmall.data.dto.UserDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description: 封装登录返回数据
 * @author: liaojiaxi
 * @date: 2020/8/18
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class AppLoginResponseVo extends BaseVo {
    private String token;
    private UserDto userDto;
}
