package com.game.firstgameserver.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class User {
    //@TableId(type = IdType.ASSIGN_ID)
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String mailaddress;
    private Boolean isconfirmed;
}
