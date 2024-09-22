package com.game.firstgameserver;

import com.game.firstgameserver.game.service.MailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MailTest {

    @Autowired
    MailService mailService;


    @Test
    public void testmailservice() {

        mailService.sendSimpleMail(
                "jftt_wingedhussar@163.com",
                "876029418@qq.com",
                "邮件的标题",
                "wwwcn.pornhub.com"

        );

    }

}
