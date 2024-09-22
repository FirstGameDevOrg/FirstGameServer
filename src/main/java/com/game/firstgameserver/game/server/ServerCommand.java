package com.game.firstgameserver.game.server;

import com.game.firstgameserver.game.msg.PlayroomInfo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Data
@Setter
@ToString
@Getter
public class ServerCommand {

    static Map<Integer, PlayroomInfo> PlayroomInfoMap = new HashMap<>();

    public static void addroomitem(int key, PlayroomInfo playroomInfo) {
        PlayroomInfoMap.put(key, playroomInfo);
        System.out.println("现在的大厅列表是：" + PlayroomInfoMap);

    }

    public static Map<Integer, PlayroomInfo> getroomitem() {
        return PlayroomInfoMap;
    }
    public static int getlength(){

        return  PlayroomInfoMap.size();
    }

}
