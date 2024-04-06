package com.yoyo.module6.controller;

import com.yoyo.module6.pojo.Result;
import com.yoyo.module6.pojo.User;
import com.yoyo.module6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Result insertUser(@RequestBody User user){
        userService.insertUser(user);
        return Result.success();

    }

    @DeleteMapping("/{id}")
    public Result deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return Result.success();

}
}
