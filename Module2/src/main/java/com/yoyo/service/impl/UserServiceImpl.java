package com.yoyo.service.impl;

import com.yoyo.mapper.BorrowBookMapper;
import com.yoyo.mapper.UserMapper;
import com.yoyo.pojo.User;
import com.yoyo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BorrowBookMapper borrowBookMapper;

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        borrowBookMapper.deleteByUserId(id);
        userMapper.deleteUser(id);
    }
}
