package com.example.springboottest01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootTest01Application {
    /*@Value(value = "${book.author}")
    private String bookAuthor;
    @Value(value = "${book.name}")
    private String bookName;
    @Value(value = "${book.pinyin}")
    private String bookPinYin;*/
    @Autowired
    private BookBean bookBean;

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringbootTest01Application.class);
        //修改banner的模式为OFF
        builder.bannerMode(Banner.Mode.OFF).run(args);
    }

    @RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
    String index() {
        Logger logger = LoggerFactory.getLogger(SpringbootTest01Application.class);
        logger.info("执行index方法！！！！！！！！！！！");
        return "Hello Spring Boot! The BookName is " + bookBean.getName() + ";and Book Author is " + bookBean.getAuthor() + ";and Book PinYin is " + bookBean.getPrice();
    }

}
