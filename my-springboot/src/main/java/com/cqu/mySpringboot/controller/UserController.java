package com.cqu.mySpringboot.controller;

import com.cqu.mySpringboot.entity.User;
import com.cqu.mySpringboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/user")
    public List getUser()
    {
        List<User> list=userMapper.getAll();
        System.out.println(list);
        return list;
    }
}
