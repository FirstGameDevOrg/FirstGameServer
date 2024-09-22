package com.game.firstgameserver.game.action.impl;

import com.game.firstgameserver.game.action.cmd.CmdForUser;
import com.game.firstgameserver.game.jwt.JwtUtils;
import com.game.firstgameserver.game.msg.UserInfo;
import com.game.firstgameserver.game.msg.UserLogin;
import com.game.firstgameserver.game.service.UserLoginService;
import com.game.firstgameserver.pojo.User;
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
@ActionController(CmdForUser.cmd)
public class LoginAction {
    /**
     *
     */
    @Autowired
    UserLoginService userLoginService;
    @Autowired
    private JwtUtils jwtUtils;

    /**
     * 登录方法
     *
     * @param userLogin userLogin
     * @return UserInfo
     */
    @ActionMethod(CmdForUser.login)
    public UserInfo login(UserLogin userLogin, FlowContext flowContext) {
        log.info("登录");
        if (userLoginService.userIsExist(userLogin)) {
            User user = userLoginService.queryUserInfo(userLogin);
            if (user.getIsconfirmed()) {
                String jwt = jwtUtils.generateToken(userLogin);
                boolean success = UserIdSettingKit.settingUserId(flowContext, user.getId());
                if (success) {
                    log.info("zzzzz success", user.getId());
                } else {
                    log.info("zzzzz failed");
                }
                UserInfo userInfo = new UserInfo();
                userInfo.setId(user.getId());
                userInfo.setJwt(jwt);
                userInfo.setName(user.getUsername());
                //userInfo.setName("朱广锋");
                return userInfo;
            } else {
                return null;
            }
        } else {
            log.info("zzzzz", "user is not exist");
            return null;
        }
    }
}
