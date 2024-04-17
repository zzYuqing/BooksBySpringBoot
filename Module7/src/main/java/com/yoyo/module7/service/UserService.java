package com.yoyo.module7.service;

import com.yoyo.module7.pojo.User;

public interface UserService {


    public void insertUser(User user);

    public void deleteUser(Integer id);

    public User login(User user);
}
