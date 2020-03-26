package com.example.springboottest13.controller;

import com.example.springboottest13.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

@RestController
public class UserController {

    @GetMapping("/test")
    public Object test(User user){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(user.getBirthday());
    }
}
