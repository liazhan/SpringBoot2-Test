package com.example.usemystarter;

import com.example.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class UsemystarterApplication {

    @Autowired
    private HelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(UsemystarterApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return helloService.sayHello();
    }
}
