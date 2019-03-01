package com.kenshin.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SayHello {

    @RequestMapping(value="/hello")
    public Map<String ,Object> hello(){
        Map<String ,Object> map = new HashMap<String ,Object>();
        map.put("msg"," Hello,How are you?");
        return map;
    }
}
