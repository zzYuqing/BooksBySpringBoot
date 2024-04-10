package com.yoyo.module6.service;

import com.yoyo.module6.pojo.User;

public interface UserService {


    public void insertUser(User user);

    public void deleteUser(Integer id);

    public User login(User user);
}
