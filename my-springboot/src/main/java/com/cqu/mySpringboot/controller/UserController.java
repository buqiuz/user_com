package com.cqu.mySpringboot.controller;

import com.cqu.mySpringboot.entity.User;
import com.cqu.mySpringboot.mapper.UserMapper;
import com.cqu.mySpringboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public List<User> getUser()
    {
        List<User> list=userService.list();
        System.out.println(list);
        return list;
    }
    @GetMapping("/getUserById")
    public User getUserById(int id)
    {
        User user=userService.getById(id);
        System.out.println(user);
        return user;
    }
    @PostMapping("/addUser")
    public String addUser(User user)
    {
        boolean num=userService.save(user);
        if(num)
        {
            return "success";
        }
        else
        {
            return "fail";
        }
    }
    @PostMapping("/deleteUserById")
    public String deleteUserById(int id)
    {
        boolean num=userService.removeById(id);
        if(num)
        {
            return "success";
        }
        else
        {
            return "fail";
        }
    }
}
