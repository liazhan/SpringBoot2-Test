package com.example.springboottest11.service;

import com.example.springboottest11.model.Person;

public interface DemoService {
    public Person savePersonWithRollBack(Person person);

    public Person savePersonWithoutRollBack(Person person);
}
