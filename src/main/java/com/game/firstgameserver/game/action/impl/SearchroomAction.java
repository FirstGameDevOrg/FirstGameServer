package com.game.firstgameserver.game.action.impl;

import com.game.firstgameserver.game.action.cmd.CmdForCreate;
import com.game.firstgameserver.game.msg.PlayroomList;
import com.game.firstgameserver.game.server.ServerCommand;
import com.iohao.game.action.skeleton.annotation.ActionController;
import com.iohao.game.action.skeleton.annotation.ActionMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 房间相关
 */
@Slf4j
@Component

@ActionController(CmdForCreate.cmd)
public class SearchroomAction {
    /**
     * @return 返回房间列表
     */
    @ActionMethod(CmdForCreate.search)
    public PlayroomList search() {
        //获取大厅列表
        PlayroomList playroomList = new PlayroomList();
        playroomList.longPlayroomInfoMap = ServerCommand.getroomitem();
        return playroomList;
    }


}
