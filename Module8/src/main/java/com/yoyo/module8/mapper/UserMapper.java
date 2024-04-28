package com.yoyo.module8.mapper;

import com.yoyo.module8.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("insert into user(username, password) " +
            "values (#{username},#{password})")
    public void insertUser(User user);

    @Delete("delete from user where id=#{id}")
    public void deleteUser(Integer id);

    @Select("select * from user where username=#{username} and password=#{password}")
    public User selectUser(User user);
}
