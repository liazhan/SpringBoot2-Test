package com.example.springboottest13.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User{
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
