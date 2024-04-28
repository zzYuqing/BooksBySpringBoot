package com.yoyo.module8.service;

import com.yoyo.module8.pojo.User;

public interface UserService {


    public void insertUser(User user);

    public void deleteUser(Integer id);

    public User login(User user);
}
