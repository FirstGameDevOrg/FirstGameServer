package com.game.firstgameserver.iogame.action;

import com.game.firstgameserver.iogame.msg.HelloSpringMsg;
import com.game.firstgameserver.iogame.msg.PlayroomInfo;
import com.game.firstgameserver.iogame.msg.PlayroomList;
import com.game.firstgameserver.iogame.msg.UserCreate;
import com.game.firstgameserver.iogame.server.DemoServerCommand;
import com.iohao.game.action.skeleton.annotation.ActionController;
import com.iohao.game.action.skeleton.annotation.ActionMethod;
import com.iohao.game.action.skeleton.core.flow.FlowContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component

@ActionController(DemoCmdForCreate.cmd)
public class DemoSearchroomAction {
    @ActionMethod(DemoCmdForCreate.search)
    public PlayroomList here() {
//获取大厅列表
        PlayroomList playroomList = new PlayroomList();
        playroomList.stringPlayroomInfoMap = DemoServerCommand.getroomitem();
        return playroomList;
    }


}
