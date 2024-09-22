package com.game.firstgameserver.game.msg;

/**
 * 单个房间信息
 *
 * @author zlk
 */

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
public class PlayroomList {
    /**
     * 房间列表map
     */
    Map<Integer, PlayroomInfo> longPlayroomInfoMap;
}
