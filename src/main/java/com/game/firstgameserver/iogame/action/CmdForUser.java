package com.game.firstgameserver.iogame.action;

import com.game.firstgameserver.iogame.common.ModuleCmd;

public interface CmdForUser {
    /**
     * 模块 - 主 cmd : 15
     */
    int cmd = ModuleCmd.userModuleCmd;

    /**
     * 示例  登录方法
     */
    int login = 0;
}
