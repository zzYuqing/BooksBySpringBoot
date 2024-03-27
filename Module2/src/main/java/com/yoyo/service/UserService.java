package com.yoyo.service;

import com.yoyo.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface UserService {


    public void insertUser(User user);

    public void deleteUser(Integer id);
}
