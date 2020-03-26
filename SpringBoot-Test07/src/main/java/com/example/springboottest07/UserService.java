package com.example.springboottest07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.List;

@Service
public class UserService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int addUser(User user){
        return jdbcTemplate.update("insert into user(username,address) values(?,?);",user.getUsername(),user.getAddress());
    }

    public int addUser2(User user){
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int update = jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement("insert into user(username,address) values(?,?);", Statement.RETURN_GENERATED_KEYS);
                ps.setString(1,user.getUsername());
                ps.setString(2,user.getAddress());
                return ps;
            }
        },keyHolder);
        System.out.println("userId是"+keyHolder.getKey().longValue());
        return update;
    }

    public List<User> getAllUsers(){
        return jdbcTemplate.query("select * from user", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                String username = resultSet.getString("username");
                String address = resultSet.getString("address");
                long id = resultSet.getLong("id");
                User user = new User();
                user.setId(id);
                user.setUsername(username);
                user.setAddress(address);
                return user;
            }
        });
    }

    public List<User> getAllUsers2(){
        return jdbcTemplate.query("select * from user",new BeanPropertyRowMapper<>(User.class));
    }
}
