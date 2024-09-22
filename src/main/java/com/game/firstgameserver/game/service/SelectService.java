package com.game.firstgameserver.game.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.game.firstgameserver.mapper.UserMapper;
import com.game.firstgameserver.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SelectService {

    @Autowired
    private UserMapper userMapper;

    //查询username存不存在的方法
    public boolean usernameIsExist(String username) {
        QueryWrapper<User> queryWrapper = new QueryWrapper();
        queryWrapper.eq("username", username);
        List<User> list = userMapper.selectList(queryWrapper);
        return !list.isEmpty();

    }

    //查询mailaddress存不存在的方法
    public boolean mailaddressIsExist(String mailaddress) {
        QueryWrapper<User> queryWrapper = new QueryWrapper();
        queryWrapper.eq("mailaddress", mailaddress);
        List<User> list = userMapper.selectList(queryWrapper);
        return !list.isEmpty();

    }


}
