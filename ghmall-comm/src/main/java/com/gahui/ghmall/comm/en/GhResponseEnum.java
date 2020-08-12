package com.gahui.ghmall.comm.en;

import com.gahui.ghmall.comm.constant.Constant;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/6
 **/
public enum GhResponseEnum {
    /**
     * 响应成功
     */
    SUCCESS(Constant.RESPONSE_SUCCESS_CODE,"响应成功"),
    /**
     * 响应失败
     */
    FAIL(Constant.RESPONSE_FAIL_CODE,"响应失败"),
    /**
     * 鉴权失败
     */
    AUTH_FAIL(Constant.RESPONSE_AUTH_FAIL_CODE,"鉴权失败")
    ;

    private String code;
    private String message;

    GhResponseEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
