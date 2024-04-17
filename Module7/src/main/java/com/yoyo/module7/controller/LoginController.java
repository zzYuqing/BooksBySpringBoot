package com.yoyo.module7.controller;


import com.yoyo.module7.pojo.Result;
import com.yoyo.module7.pojo.User;
import com.yoyo.module7.service.UserService;
import com.yoyo.module7.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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
        Map<String,Object> claims=new HashMap<>();
        claims.put("id",u.getId());
        claims.put("username",u.getUsername());
        String jwt=JwtUtils.generateJwt(claims);
        return Result.success(jwt);
    }
}
