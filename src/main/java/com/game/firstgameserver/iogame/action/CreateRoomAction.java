package com.game.firstgameserver.iogame.action;

import com.game.firstgameserver.iogame.msg.PlayroomInfo;
import com.game.firstgameserver.iogame.msg.UserCreateRoom;
import com.game.firstgameserver.iogame.server.ServerCommand;
import com.iohao.game.action.skeleton.annotation.ActionController;
import com.iohao.game.action.skeleton.annotation.ActionMethod;
import com.iohao.game.action.skeleton.core.flow.FlowContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 创建房间请求
 */
@Slf4j
@Component


@ActionController(CmdForCreate.cmd)
public class CreateRoomAction {



    /**
     * 创建房间方法
     *
     * @param userCreateRoom userCreateRoom
     * @return long
     **/
    @ActionMethod(CmdForCreate.create)

    public int here(UserCreateRoom userCreateRoom, FlowContext flowContext) {

        /*
         * 获取userid
         * */
        int primaryUserId = (int) flowContext.getUserId();

        //系统生成一个房间id
        int roomID = 100 + ServerCommand.getlength();
        //String roomid = String.valueOf(roomlist);
        //获取用户自定义的房间名
        String roomName = userCreateRoom.getRoomName();

        /*
         * 最大玩家数
         * */
        int playerMaxCount = userCreateRoom.getPlayerCount();
        //RoomID_long roomID_long = new RoomID_long();
        // boolean success = UserIdSettingKit.settingUserId(flowContext, newUserId);
        if (playerMaxCount<5) {

            PlayroomInfo playroomInfo = new PlayroomInfo();
            playroomInfo.setPrimaryuserID(primaryUserId);
            //房间id
            playroomInfo.setRoomId(roomID);
            //房间名
            playroomInfo.setRoomName(roomName);
            //主机id
            playroomInfo.setPrimaryuserID(primaryUserId);
            //房间最大人数
            playroomInfo.setPlayerMaxCount(playerMaxCount);
            playroomInfo.setPlayerCount(1);
            //房间列表更新
            ServerCommand.addroomitem(roomID, playroomInfo);
            log.info("Create room success", primaryUserId, roomID, roomName, playerMaxCount);
            return roomID;

        } else {

            return 99;
        }


    }

}
