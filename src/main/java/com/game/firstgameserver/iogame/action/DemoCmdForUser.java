package com.game.firstgameserver.iogame.action;

import com.game.firstgameserver.iogame.common.DemoModuleCmd;

public interface DemoCmdForUser {
    /**
     * 模块 - 主 cmd : 15
     */
    int cmd = DemoModuleCmd.userModuleCmd;

    /**
     * 示例  登录方法
     */
    int login = 0;
}
