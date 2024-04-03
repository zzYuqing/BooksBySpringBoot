package com.yoyo.module5.mapper;

import com.yoyo.module5.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("insert into user(username, password) " +
            "values (#{username},#{password})")
    public void insertUser(User user);

    @Delete("delete from user where id=#{id}")
    public void deleteUser(Integer id);
}
