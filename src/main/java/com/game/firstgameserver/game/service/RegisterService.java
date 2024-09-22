package com.game.firstgameserver.game.service;

import com.game.firstgameserver.mapper.UserMapper;
import com.game.firstgameserver.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterService {
    @Autowired
    private UserMapper userMapper;

    public void userInsert(User user_input) {

        User user = new User();
        user.setUsername(user_input.getUsername());
        user.setPassword(user_input.getPassword());
        user.setMailaddress(user_input.getMailaddress());
        user.setIsconfirmed(false);
        userMapper.insert(user);



    }
}
