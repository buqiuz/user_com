package com.cqu.mySpringboot.mapper;

import com.cqu.mySpringboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;
@Mapper
public interface UserMapper {
    //查询所有用户
    @Select("select * from user")
    public List<User> getAll();
}
