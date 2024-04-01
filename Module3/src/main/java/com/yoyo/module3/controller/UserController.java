package com.yoyo.module3.controller;

import com.yoyo.module3.pojo.User;
import com.yoyo.module3.service.UserService;
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
