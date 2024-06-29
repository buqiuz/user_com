package com.cqu.mySpringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping (value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "煞笔，还看！";//会返回json格式的数据
    }
}

