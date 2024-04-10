package com.yoyo.module6.controller;


import com.yoyo.module6.pojo.Result;
import com.yoyo.module6.pojo.User;
import com.yoyo.module6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Result login(@RequestBody User user){
        User u=userService.login(user);
        if(u==null){
            return Result.error();
        }
        return Result.success();
    }
}
