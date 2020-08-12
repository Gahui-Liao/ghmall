package com.gahui.ghmall.comm.exception;

import com.gahui.ghmall.comm.en.GhResponseEnum;
import com.gahui.ghmall.comm.vo.GhResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 捕获controller抛出的异常
 * @author: liaojiaxi
 * @date: 2020/8/10
 **/
@ControllerAdvice
public class ControllerException {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public GhResponse handleException(Exception e) {
        String msg = e.getMessage();
        if (StringUtils.isEmpty(msg)) {
            msg = "服务器打了个盹，请稍后重试！";
        }
        if(e instanceof GhRuntimeException){
            return new GhResponse<>(GhResponseEnum.AUTH_FAIL,msg);
        }
        return new GhResponse<>(GhResponseEnum.FAIL,msg);
    }
}
