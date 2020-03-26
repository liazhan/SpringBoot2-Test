package com.example.springboottest09.dao;

import com.example.springboottest09.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {
    List<User> getUserByAddressEqualsAndIdLessThanEqual(String address,Integer id);
    @Query(value = "select * from t_user where id=(select max(id) from t_user)",nativeQuery = true)
    User maxIdUser();
}
