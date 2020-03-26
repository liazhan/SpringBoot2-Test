package com.example.springboottest08;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.springboottest08.mapper")
public class SpringbootTest08Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTest08Application.class, args);
	}

}
