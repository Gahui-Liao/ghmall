package com.gahui.ghmall.data.service.impl;

import com.gahui.ghmall.comm.constant.Constant;
import com.gahui.ghmall.comm.util.GhCopyUtil;
import com.gahui.ghmall.data.dto.UserDto;
import com.gahui.ghmall.data.entity.GhUser;
import com.gahui.ghmall.data.entity.GhUserExample;
import com.gahui.ghmall.data.mapper.GhUserMapper;
import com.gahui.ghmall.data.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: liaojiaxi
 * @date: 2020/8/10
 **/
@Service("userService")
public class UserServicerImpl implements UserService {

    @Resource
    GhUserMapper userMapper;

    @Override
    public UserDto getUserByWetChatOpenId(String weChatOpenId) {
        GhUserExample example = new GhUserExample();
        example.createCriteria().andWechatOpenidEqualTo(weChatOpenId).andStatusEqualTo(Constant.STATUS_EFF);
        List<GhUser> users = userMapper.selectByExample(example);
        GhUser user = null;
        if (users != null & users.size() > 0) {
            user = users.get(0);
        }
        return GhCopyUtil.copyProperties(user, UserDto.class);
    }

    @Override
    public int insertUser(UserDto userDto) {
        GhUser user = GhCopyUtil.copyProperties(userDto,GhUser.class);
        return userMapper.insertSelective(user);
    }

    @Override
    public UserDto getUserByUserId(int userId) {
        return GhCopyUtil.copyProperties(userMapper.selectByPrimaryKey(userId),UserDto.class);
    }
}
