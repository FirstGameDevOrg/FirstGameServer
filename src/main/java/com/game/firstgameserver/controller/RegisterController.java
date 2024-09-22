package com.game.firstgameserver.controller;


import com.game.firstgameserver.game.service.RegisterService;
import com.game.firstgameserver.game.service.SelectService;
import com.game.firstgameserver.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 注册
 */
@Slf4j
@RestController
public class RegisterController {
    @Autowired
    RegisterService registerService;
    @Autowired
    SelectService selectService;

    @PostMapping("/register")
    public Integer registerResult(@RequestParam("userName") String userName, @RequestParam("password") String password, @RequestParam("mailAddress") String mailAddress) {
        log.info(userName + password + mailAddress);
        User user = new User();
        //参数传入空值，返回错误码F
        if(userName.equals("")||password.equals("")||mailAddress.equals(""))
            return 0xF;
            //username存在，返回错误码1
        else if (selectService.usernameIsExist(userName))
            return 1;
            //邮箱存在，返回错误码2
        else if (selectService.mailaddressIsExist(mailAddress))
            return 2;

        else {
            //调用insert方法
            user.setUsername(userName);
            user.setPassword(password);
            user.setMailaddress(mailAddress);
            registerService.userInsert(user);
            return 0;

        }
    }
}
