package com.game.firstgameserver.iogame.action;

import com.game.firstgameserver.iogame.jwt.JwtUtils;
import com.game.firstgameserver.iogame.msg.UserInfo;
import com.game.firstgameserver.iogame.msg.UserLogin;
import com.game.firstgameserver.iogame.service.DemoSpringService;
import com.iohao.game.action.skeleton.annotation.ActionController;
import com.iohao.game.action.skeleton.annotation.ActionMethod;
import com.iohao.game.action.skeleton.core.flow.FlowContext;
import com.iohao.game.bolt.broker.client.kit.UserIdSettingKit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户登录有关事务
 */
@Slf4j
@Component
@ActionController(DemoCmdForUser.cmd)
public class DemoLoginAction {
    /**
     * spring 管理的类： service 业务类
     */
    @Autowired
    DemoSpringService demoSpringService;
    @Autowired
    private JwtUtils jwtUtils;

    /**
     * 登录方法
     *
     * @param userLogin userLogin
     * @return UserInfo
     */
    @ActionMethod(DemoCmdForUser.login)
    public UserInfo here(UserLogin userLogin, FlowContext flowContext) {
        String jwt = jwtUtils.generateToken(userLogin);
        long newUserId = 100;

        boolean success = UserIdSettingKit.settingUserId(flowContext, newUserId);
        if (success) {
            log.info("zzzzz success", newUserId);
        } else {
            log.info("zzzzz failed");
        }
        UserInfo userInfo = new UserInfo();
        userInfo.setId(newUserId);
        userInfo.setJwt(jwt);
        userInfo.setName("朱广锋");
        return userInfo;
    }
}
