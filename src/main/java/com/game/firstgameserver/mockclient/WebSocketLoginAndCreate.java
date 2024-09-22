package com.game.firstgameserver.mockclient;

import com.game.firstgameserver.game.msg.UserCreateRoom;
import com.game.firstgameserver.game.msg.UserInfo;
import com.game.firstgameserver.game.msg.UserLogin;
import com.game.firstgameserver.game.utils.ClientCommandKit;
import com.game.firstgameserver.game.utils.WebsocketClientKit;
import com.iohao.game.bolt.broker.client.external.bootstrap.message.ExternalMessage;

/**
 * 模拟客户端
 */
public class WebSocketLoginAndCreate {
    public static void main(String[] args) throws Exception {

        initClientCommands();

        // 启动客户端
        WebsocketClientKit.runClient();
    }

    private static void initClientCommands() {
        UserCreateRoom userCreateRoom=new UserCreateRoom();
        UserLogin userLogin=new UserLogin();
        userLogin.email="876029418@qq.com";
        userLogin.password="123456";
        userCreateRoom.setRoomName("银趴");
        userCreateRoom.setPlayerCount(4);
        // 请求、响应
        ExternalMessage externalMessageHere = ClientCommandKit.createExternalMessage(
                // CmdForSpring.cmd,
                // CmdForSpring.here,
                15, 0, userLogin

        );

        ExternalMessage externalMessag_create = ClientCommandKit.createExternalMessage(
                // CmdForSpring.cmd,
                // CmdForSpring.here,
                8, 2, userCreateRoom

        );

        ClientCommandKit.createClientCommand(externalMessageHere, UserInfo.class);
//        ClientCommandKit.createClientCommand(externalMessag_create, LongPb.class);
        ClientCommandKit.login=true;
    }


}
