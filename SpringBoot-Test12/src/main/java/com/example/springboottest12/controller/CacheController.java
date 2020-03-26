package com.example.springboottest12.controller;

import com.example.springboottest12.model.Person;
import com.example.springboottest12.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {
    @Autowired
    DemoService demoService;

    @RequestMapping("/put")
    public Person put(Person person) {
        return demoService.save(person);
    }

    @RequestMapping("/able")
    public Person cacheable(Person person) {
        return demoService.findById(person);
    }

    @RequestMapping("/evit")
    public String evit(Long id) {
        demoService.deleteById(id);
        return "ok";
    }
}
