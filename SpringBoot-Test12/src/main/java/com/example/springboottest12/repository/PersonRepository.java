package com.example.springboottest12.repository;

import com.example.springboottest12.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
