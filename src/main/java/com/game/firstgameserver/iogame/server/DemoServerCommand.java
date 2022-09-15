package com.game.firstgameserver.iogame.server;

import com.game.firstgameserver.iogame.msg.PlayroomInfo;

import java.util.HashMap;
import java.util.Map;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
//
@Data
@Setter
@ToString
@Getter
public class DemoServerCommand {

    static Map<String, PlayroomInfo> stringPlayroomInfoMap=new HashMap<>();
    public static void addroomitem(String key,PlayroomInfo playroomInfo){
        stringPlayroomInfoMap.put(key,playroomInfo);
        System.out.println("现在的大厅列表是："+stringPlayroomInfoMap);

    }
    public static Map<String, PlayroomInfo> getroomitem(){
        return  stringPlayroomInfoMap;
    }
    public static int getlength(){

        return  stringPlayroomInfoMap.size();
    }

}
