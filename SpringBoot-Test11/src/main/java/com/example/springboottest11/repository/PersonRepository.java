package com.example.springboottest11.repository;

import com.example.springboottest11.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
