package com.cqu.mySpringboot.controller;

import com.cqu.mySpringboot.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamsController {
    @RequestMapping(value = "getTest1",method = RequestMethod.GET)
    public String getTest1(){
        return "getTest1";
    }
    @RequestMapping(value = "getTest2",method = RequestMethod.GET)
    public String getTest2(String name){
        System.out.println("name:"+name);
        return "getTest2";
    }
    @RequestMapping(value = "postTest3",method = RequestMethod.POST)
    public String postTest3(String name){
        System.out.println("name:"+name);
        return "postTest3";
    }
    @RequestMapping(value = "postTest4",method = RequestMethod.POST)
    public String postTest4(User user){
        System.out.println("username:"+user.getUsername()+"password:"+user.getPassword());
        return "postTest4";

    }
}
