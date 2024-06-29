package com.cqu.mySpringboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqu.mySpringboot.entity.User;
import com.cqu.mySpringboot.mapper.UserMapper;
import com.cqu.mySpringboot.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
