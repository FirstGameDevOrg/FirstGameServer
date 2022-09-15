package com.game.firstgameserver.iogame.msg;

import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.iohao.game.widget.light.protobuf.ProtoFileMerge;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@Data
@Setter
@ToString
@ProtobufClass
@ProtoFileMerge(fileName = "socket.proto", filePackage = "pb.socket")
@FieldDefaults(level = AccessLevel.PUBLIC)
public class PlayroomInfo {

    //服务器生成的
    String roomid;

    //用户创建的
    String roomname;

//主机用户名
    String primaryuserID;


}
