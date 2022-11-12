package com.game.firstgameserver.iogame.action;

import com.game.firstgameserver.iogame.msg.PlayroomList;
import com.game.firstgameserver.iogame.server.ServerCommand;
import com.iohao.game.action.skeleton.annotation.ActionController;
import com.iohao.game.action.skeleton.annotation.ActionMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component

@ActionController(CmdForCreate.cmd)
public class SearchroomAction {
    @ActionMethod(CmdForCreate.search)
    public PlayroomList here() {
//获取大厅列表
        PlayroomList playroomList = new PlayroomList();
        playroomList.stringPlayroomInfoMap = ServerCommand.getroomitem();
        return playroomList;
    }


}
