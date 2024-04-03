package com.yoyo.module4.controller;

import com.yoyo.module4.pojo.User;
import com.yoyo.module4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void insertUser(@RequestBody User user){
        userService.insertUser(user);

    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);

}
}
