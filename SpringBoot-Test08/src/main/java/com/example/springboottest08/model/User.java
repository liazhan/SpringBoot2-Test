package com.example.springboottest08.model;

/**
 * @ClassName User
 * @Description TODO
 * @Author lhw
 * @Date 2020/3/17 14:22
 * @Version 1.0
 **/
public class User {
    private Long id;
    private String username;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
