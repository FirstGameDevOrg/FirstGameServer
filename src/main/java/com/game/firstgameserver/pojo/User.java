package com.game.firstgameserver.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("ueuser")

public class User {
 //   @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String username;
    private String password;
    private String mailaddress;
    private Boolean isconfirmed;

}
