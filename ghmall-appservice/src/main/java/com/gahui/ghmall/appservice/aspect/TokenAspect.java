package com.gahui.ghmall.appservice.aspect;

import com.gahui.ghmall.appservice.service.TokenService;
import com.gahui.ghmall.comm.constant.Constant;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @description: 使用AOP进行token鉴权
 * @author: liaojiaxi
 * @date: 2020/8/11
 **/
@Slf4j
@Aspect
@Component
public class TokenAspect {

    @Resource
    HttpServletRequest request;

    @Resource
    TokenService tokenService;

    /**
     * 是否开启token鉴权
     */
    @Value("${tokenAuth.openAuth:true}")
    boolean openAuth;

    @Pointcut(value = "@annotation(com.gahui.ghmall.comm.annotation.AuthRequired)")
    public void getPointCut() {
    }

    @Before("getPointCut()")
    public void doBefore(){
        if(!openAuth){
            return;
        }
        String token = request.getHeader("token");
        log.info("切面获取到token为===>{}",token);

        Map map = tokenService.verifyToken(token);
        //拿到用户名和密码
        String userName = (String) map.get(Constant.TOKEN_USER_NAME);
        String passWord = (String) map.get(Constant.TOKEN_PASS_WORD);

    }

}
