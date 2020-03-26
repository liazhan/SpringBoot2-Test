package com.example.springboottest11.service.impl;

import com.example.springboottest11.model.Person;
import com.example.springboottest11.repository.PersonRepository;
import com.example.springboottest11.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private PersonRepository personRepository;

    @Transactional(rollbackFor = {IllegalArgumentException.class})
    @Override
    public Person savePersonWithRollBack(Person person) {
        Person p = personRepository.save(person);
        if(person.getName().equals("sang")){
            throw new IllegalArgumentException("sang已存在，数据将回滚");
        }
        return p;
    }

    @Transactional(noRollbackFor = {IllegalArgumentException.class})
    @Override
    public Person savePersonWithoutRollBack(Person person) {
        Person p = personRepository.save(person);
        if(person.getName().equals("sang")){
            throw new IllegalArgumentException("sang已存在，但数据不会回滚");
        }
        return p;
    }
}
