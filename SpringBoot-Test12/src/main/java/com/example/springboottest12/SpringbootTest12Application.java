package com.example.springboottest12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringbootTest12Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTest12Application.class, args);
    }

}
