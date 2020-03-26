package com.example.springboottest08.controller;

import com.example.springboottest08.model.User;
import com.example.springboottest08.mapper.UserMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author lhw
 * @Date 2020/3/17 15:26
 * @Version 1.0
 **/
@RestController
public class UserController {
    @Autowired
    private UserMapper2 userMapper2;

    @RequestMapping("/getAllUsers")
    public Object getAllUsers(){
        List<User> allUsers = userMapper2.getAllUser();
        return allUsers;
    }
}
