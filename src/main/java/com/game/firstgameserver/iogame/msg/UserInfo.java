package com.game.firstgameserver.iogame.msg;

import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.iohao.game.widget.light.protobuf.ProtoFileMerge;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * @author zh
 */
@Data
@Setter
@ToString
@ProtobufClass
@ProtoFileMerge(fileName = "socket.proto", filePackage = "pb.socket")
@FieldDefaults(level = AccessLevel.PUBLIC)
public class UserInfo {
    //id
    long id;
    //用户昵称
    String name;
    //jwt
    String jwt;
}
