package com.game.firstgameserver.iogame.server;

import com.game.firstgameserver.iogame.msg.PlayroomInfo;
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

    static Map<Long, PlayroomInfo> stringPlayroomInfoMap = new HashMap<>();

    public static void addroomitem(long key, PlayroomInfo playroomInfo) {
        stringPlayroomInfoMap.put(key, playroomInfo);
        System.out.println("现在的大厅列表是：" + stringPlayroomInfoMap);

    }

    public static Map<Long, PlayroomInfo> getroomitem() {
        return stringPlayroomInfoMap;
    }
    public static int getlength(){

        return  stringPlayroomInfoMap.size();
    }

}
