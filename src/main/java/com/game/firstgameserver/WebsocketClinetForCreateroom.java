package com.game.firstgameserver;


import com.game.firstgameserver.iogame.msg.PlayroomInfo;
import com.game.firstgameserver.iogame.msg.UserCreate;
import com.game.firstgameserver.iogame.utils.ClientCommandKit;
import com.game.firstgameserver.iogame.utils.WebsocketClientKit;
import com.iohao.game.bolt.broker.client.external.bootstrap.message.ExternalMessage;

public class WebsocketClinetForCreateroom {


    public static void main(String[] args) throws Exception {

        initClientCommands();

        // 启动客户端
        WebsocketClientKit.runClient();
    }

    private static void initClientCommands() {
        UserCreate userCreate = new UserCreate();
        userCreate.setUsername("张三");
        userCreate.setRoomname("fuck");

        // 请求、响应
        ExternalMessage externalMessageHere = ClientCommandKit.createExternalMessage(
                // CmdForSpring.cmd,
                // CmdForSpring.here,
                8, 2,
                userCreate
        );

        ClientCommandKit.createClientCommand(externalMessageHere, PlayroomInfo.class);
    }
}
