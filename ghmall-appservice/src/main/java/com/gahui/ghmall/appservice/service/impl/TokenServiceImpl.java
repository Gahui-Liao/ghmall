package com.gahui.ghmall.appservice.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.gahui.ghmall.appservice.service.TokenService;
import com.gahui.ghmall.comm.constant.Constant;
import com.gahui.ghmall.data.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

/**
 * @description: token相关业务
 * @author: liaojiaxi
 * @date: 2020/8/10
 **/
@Slf4j
@Service("tokenService")
public class TokenServiceImpl implements TokenService {

    @Override
    public String getToken(UserDto userDto) {

        String token;
        try {
            //过期时间
            Date date = new Date(System.currentTimeMillis() + Constant.TOKEN_EXPIRED_TIME);
            //秘钥及加密算法
            Algorithm algorithm = Algorithm.HMAC256(Constant.TOKEN_ALGORITHM_SECRET);
            //携带username，password信息，生成签名
            token = JWT.create()
                    .withClaim("username", userDto.getUserName())
                    .withClaim("password", userDto.getUserPassword())
                    .withExpiresAt(date)
                    .sign(algorithm);
        } catch (Exception e) {
            log.error("生成token失败!!!");
            return null;
        }
        return token;
    }

    @Override
    public Map verifyToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(Constant.TOKEN_ALGORITHM_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            return jwt.getClaims();
        } catch (Exception e) {
            log.error("解析token失败!!!");
        }
        return null;
    }
}
