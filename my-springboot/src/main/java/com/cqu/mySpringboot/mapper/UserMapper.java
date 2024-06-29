package com.cqu.mySpringboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cqu.mySpringboot.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;
@Mapper
public interface UserMapper extends BaseMapper<User> {

//    //查询所有用户
//    @Select("select * from user")
//    List<User> getAll();
//    //根据id查询用户
//    @Select("select * from user where id = #{id}")
//    User getUserById(int id);
//    //添加用户
//    @Insert("insert into user values(#{id},#{username},#{password})")
//    int addUser(User user);
//    //删除用户
//    @Delete("delete from user where id = #{id}")
//    int deleteUserById(int id);

}
