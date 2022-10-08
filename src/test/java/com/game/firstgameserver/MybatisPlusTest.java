package com.game.firstgameserver;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.game.firstgameserver.mapper.UserMapper;
import com.game.firstgameserver.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest

public class MybatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList() {
       // String username = "李四";
        //QueryWrapper<User> queryWrapper = new QueryWrapper();

       // queryWrapper.eq("mailaddress", username);
       // List<User> list = userMapper.selectList(queryWrapper);
        // ueuserMapper.selectList(null);
        //  List<Ueuser>list=   ueuserMapper.selectList(null);
        // Ueuser U=  ueuserMapper.selectById(1);
        //  System.out.println(U);
        // list.forEach(System.out::println);
    }


}
