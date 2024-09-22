package com.game.firstgameserver.game.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.game.firstgameserver.game.msg.UserLogin;
import com.game.firstgameserver.mapper.UserMapper;
import com.game.firstgameserver.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户登录Service
 */
@Repository
public class UserLoginService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询用户是否存在
     *
     * @param userLogin
     * @return
     */
    public boolean userIsExist(UserLogin userLogin) {
        List<User> userList = userMapper.selectList(new QueryWrapper<User>().eq("mailaddress", userLogin.getEmail()).eq("password", userLogin.getPassword()));
        if (userList != null) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * 查询用户信息
     *
     * @param userLogin
     * @return
     */
    public User queryUserInfo(UserLogin userLogin) {
        List<User> userList = userMapper.selectList(new QueryWrapper<User>().eq("mailaddress", userLogin.getEmail()).eq("password", userLogin.getPassword()));
        return userList.get(0);
    }

}
