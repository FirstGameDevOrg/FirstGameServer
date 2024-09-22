package com.game.firstgameserver.game.msg;

import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.iohao.game.widget.light.protobuf.ProtoFileMerge;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * 房间创建信息
 *
 * @author zlk
 */

@Data
@Setter
@ToString
@ProtobufClass
@ProtoFileMerge(fileName = "socket.proto", filePackage = "pb.socket")
@FieldDefaults(level = AccessLevel.PUBLIC)
public class PlayroomInfo {
    /**
     * 房间ID
     */
    int roomId;
    /**
     * 房间名
     */
    String roomName;
    /**
     * 创建者ID
     */
    int primaryuserID;
    /**
     * 房间最大人数
     */
    int playerMaxCount;
    /**
     * 房间当前人数
     */
    int playerCount;
}
