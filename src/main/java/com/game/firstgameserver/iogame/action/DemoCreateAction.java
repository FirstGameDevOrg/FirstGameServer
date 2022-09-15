package com.game.firstgameserver.iogame.action;

import com.game.firstgameserver.iogame.msg.PlayroomInfo;
import com.game.firstgameserver.iogame.msg.UserCreate;
import com.game.firstgameserver.iogame.server.DemoServerCommand;
import com.iohao.game.action.skeleton.annotation.ActionController;
import com.iohao.game.action.skeleton.annotation.ActionMethod;
import com.iohao.game.action.skeleton.core.flow.FlowContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component


//创建房间

@ActionController(DemoCmdForCreate.cmd)
public class DemoCreateAction {

    @ActionMethod(DemoCmdForCreate.create)
    public PlayroomInfo here(UserCreate userCreate, FlowContext flowContext) {

        //String primaryUserId = flowContext.get;
        //获取房主用户名
        String primaryUserId = userCreate.getUsername();
        //系统生成一个房间id
        int roomlist=100+DemoServerCommand.getlength();
        String roomid = String.valueOf(roomlist);
        //获取用户自定义的房间名
        String roomname = userCreate.getRoomname();
        // boolean success = UserIdSettingKit.settingUserId(flowContext, newUserId);
        if (true) {
            log.info("Create room success", primaryUserId, roomid, roomname);
        } else {

        }

        PlayroomInfo playroomInfo = new PlayroomInfo();
        playroomInfo.setPrimaryuserID(primaryUserId);
        //系统生成的
        playroomInfo.setRoomid(roomid);
        //用户创建的
        playroomInfo.setRoomname(roomname);


        //
        DemoServerCommand.addroomitem(roomid,playroomInfo);
        return playroomInfo;
    }

}
