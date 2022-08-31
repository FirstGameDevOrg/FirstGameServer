package com.game.firstgameserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HelloController {
    @RequestMapping("say")
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping("")
    public String index() {
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "这是测试页面" + df.format(day);
    }
}
