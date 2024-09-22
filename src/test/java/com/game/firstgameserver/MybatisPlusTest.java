package com.game.firstgameserver;

import com.game.firstgameserver.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
