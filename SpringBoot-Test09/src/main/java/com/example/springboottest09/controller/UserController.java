package com.example.springboottest09.controller;

import com.example.springboottest09.dao.UserDao;
import com.example.springboottest09.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author lhw
 * @Date 2020/3/17 17:06
 * @Version 1.0
 **/
@RestController
public class UserController {
    @Autowired
    UserDao userDao;

    @PostMapping("/")
    public void addUser(){
        User user = new User();
        user.setId(1);
        user.setUsername("张三");
        user.setAddress("深圳");
    }

    @DeleteMapping("/")
    public void deleteById(){
        userDao.deleteById(1);
    }

    @PutMapping("/")
    public void updateUser(){
        User user = userDao.getOne(1);
        user.setUsername("李四");
        userDao.flush();
    }

    @GetMapping("/test1")
    public void test1(){
        List<User> all = userDao.findAll();
        System.out.println(all);
    }

    @GetMapping("/test2")
    public void test2(){
        List<User> list = userDao.getUserByAddressEqualsAndIdLessThanEqual("广州", 2);
        System.out.println(list);
    }

    @GetMapping("/test3")
    public void test3(){
        User user = userDao.maxIdUser();
        System.out.println(user);
    }
}
