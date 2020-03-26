package com.example.springboottest05;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @ClassName WebMvcConfig
 * @Description TODO
 * @Author lhw
 * @Date 2020/3/16 17:25
 * @Version 1.0
 **/
@Configuration
//@EnableWebMvc//无需使用该注解，否则会覆盖掉SpringBoot的默认配置值
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/ws").setViewName("/ws");
    }
}
