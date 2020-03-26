package com.example.springboottest11.controller;

import com.example.springboottest11.model.Person;
import com.example.springboottest11.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/norollback")
    public Person noRollback(Person person) {
        return demoService.savePersonWithoutRollBack(person);
    }

    @RequestMapping("/rollback")
    public Person rollback(Person person) {
        return demoService.savePersonWithRollBack(person);
    }
}
