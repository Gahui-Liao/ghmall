package com.gahui.ghmall.data.service.impl;

import com.gahui.ghmall.data.entity.GhUserExample;
import com.gahui.ghmall.data.mapper.GhUserMapper;
import com.gahui.ghmall.data.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/10
 **/
@Service("userService")
public class UserServicerImpl implements UserService {

    @Resource
    GhUserMapper userMapper;

}
