/*
 * # iohao.com . 渔民小镇
 * Copyright (C) 2021 - 2022 double joker （262610965@qq.com） . All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.game.firstgameserver.game.action.impl;

import com.game.firstgameserver.game.action.cmd.CmdForSpring;
import com.game.firstgameserver.game.msg.HelloSpringMsg;
import com.game.firstgameserver.game.service.SpringService;
import com.iohao.game.action.skeleton.annotation.ActionController;
import com.iohao.game.action.skeleton.annotation.ActionMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 这是一个spring管理的action的demo
 *
 * @author 渔民小镇
 * @date 2022-03-22
 */
@Component
@ActionController(CmdForSpring.cmd)
public class SpringAction {
    /**
     * spring 管理的类： service 业务类
     */
    @Autowired
    SpringService springService;

    /**
     * spring 示例方法
     *
     * @param helloReq helloReq
     * @return HelloReq
     */
    @ActionMethod(CmdForSpring.here)
    public HelloSpringMsg here(HelloSpringMsg helloReq) {
        return springService.here(helloReq);
    }
}
