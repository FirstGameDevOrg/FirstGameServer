package com.game.firstgameserver.iogame.msg;

import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.iohao.game.widget.light.protobuf.ProtoFileMerge;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * 用户创建房间请求
 *
 * @author zlk
 */
@Data
@Setter
@ToString
@ProtobufClass
@ProtoFileMerge(fileName = "socket.proto", filePackage = "pb.socket")
@FieldDefaults(level = AccessLevel.PUBLIC)
public class UserCreateRoom {
    /**
     * 房间名
     */
    String roomName;

    /**
     * 最大人数
     */
    int playerCount;
}
