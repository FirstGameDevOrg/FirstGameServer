package com.game.firstgameserver;

import com.game.firstgameserver.iogame.msg.PlayroomList;
import com.game.firstgameserver.iogame.utils.ClientCommandKit;
import com.game.firstgameserver.iogame.utils.WebsocketClientKit;
import com.iohao.game.bolt.broker.client.external.bootstrap.message.ExternalMessage;

public class WebsocketClinetForSearchroom {

    public static void main(String[] args) throws Exception {

        initClientCommands();

        // 启动客户端
        WebsocketClientKit.runClient();
    }

    private static void initClientCommands() {


        // 请求、响应
        ExternalMessage externalMessageHere = ClientCommandKit.createExternalMessage(
                // CmdForSpring.cmd,
                // CmdForSpring.here,
                8, 3, null

        );

        ClientCommandKit.createClientCommand(externalMessageHere, PlayroomList.class);
    }


}
