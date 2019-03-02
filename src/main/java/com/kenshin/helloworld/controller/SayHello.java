package com.kenshin.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SayHello {

    @Value("${msg.username}")
    private String username ;

    @RequestMapping(value="/hello/{content}")
    public Map<String ,Object> hello(@PathVariable("content") String content){
        Map<String ,Object> map = new HashMap<String ,Object>();
        map.put("msg"," Hello "+username+" "+content);
        return map;
    }
}
