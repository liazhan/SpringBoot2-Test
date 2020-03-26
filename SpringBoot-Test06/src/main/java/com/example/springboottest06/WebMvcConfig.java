package com.example.springboottest06;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName WebMvcConfig
 * @Description TODO
 * @Author lhw
 * @Date 2020/3/17 10:13
 * @Version 1.0
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("/login");
        registry.addViewController("/chat").setViewName("/chat");
    }
}
