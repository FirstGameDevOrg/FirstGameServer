package com.game.firstgameserver.game.action.cmd;

import com.game.firstgameserver.game.common.ModuleCmd;

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
