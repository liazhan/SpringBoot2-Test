package com.example.springboottest08.mapper;

import com.example.springboottest08.model.User;

import java.util.List;

/**
 * @ClassName UserMapper2
 * @Description TODO
 * @Author lhw
 * @Date 2020/3/17 15:48
 * @Version 1.0
 **/
public interface UserMapper2 {
    List<User> getAllUser();

    Integer addUser(User user);

    Integer updateUserById(User user);

    Integer deleteUserById(Integer id);
}

