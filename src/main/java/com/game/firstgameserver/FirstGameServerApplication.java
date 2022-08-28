package com.game.firstgameserver;

import com.game.firstgameserver.iogame.server.DemoSpringLogicServer;
import com.iohao.game.action.skeleton.ext.spring.ActionFactoryBeanForSpring;
import com.iohao.game.bolt.broker.client.external.config.ExternalGlobalConfig;
import com.iohao.game.simple.SimpleHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class FirstGameServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstGameServerApplication.class, args);

        // 注意，这个是临时测试用的，设置为 false 表示不用登录就可以访问逻辑服的方法
        ExternalGlobalConfig.verifyIdentity = false;

        
        // 游戏对外服端口
        int port = 10100;

        // spring 逻辑服
        var demoLogicServer = new DemoSpringLogicServer();

        // 启动 对外服、网关服、逻辑服; 并生成游戏业务文档
        SimpleHelper.run(port, List.of(demoLogicServer));

        /*
         * 该示例文档地址
         * https://www.yuque.com/iohao/game/evkgnz
         */
    }

    @Bean
    public ActionFactoryBeanForSpring actionFactoryBean() {
        // 将业务框架交给 spring 管理
        return ActionFactoryBeanForSpring.me();
    }

}
