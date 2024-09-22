package com.game.firstgameserver.game.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class JsonUtils {

    public String obj2json(Object obj) throws JsonProcessingException {
        ObjectMapper Obj = new ObjectMapper();
        return Obj.writeValueAsString(obj);
    }

}
