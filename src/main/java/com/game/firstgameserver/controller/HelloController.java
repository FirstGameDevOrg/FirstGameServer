package com.game.firstgameserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("say")
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping("")
    public String index() {
        return "这是测试页面";
    }
}
