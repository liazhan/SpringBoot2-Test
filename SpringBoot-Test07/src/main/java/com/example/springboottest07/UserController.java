package com.example.springboottest07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author lhw
 * @Date 2020/3/17 14:26
 * @Version 1.0
 **/
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public Object add(String username,String address){
        User user = new User();
        user.setUsername(username);
        user.setAddress(address);
        int i = userService.addUser2(user);
        return i;
    }
}
