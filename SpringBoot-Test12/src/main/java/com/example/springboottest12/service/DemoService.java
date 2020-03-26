package com.example.springboottest12.service;

import com.example.springboottest12.model.Person;

public interface DemoService {

    public Person save(Person person);

    public void deleteById(Long id);

    public Person findById(Person person);
}
