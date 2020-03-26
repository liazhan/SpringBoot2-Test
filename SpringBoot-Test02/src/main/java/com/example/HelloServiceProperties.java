package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Hello world!
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG = "world";
    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
