package com.example.springboottest12.service.impl;

import com.example.springboottest12.model.Person;
import com.example.springboottest12.repository.PersonRepository;
import com.example.springboottest12.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private PersonRepository personRepository;

    @CachePut(value = "people",key = "#person.id")
    @Override
    public Person save(Person person) {
        Person p = personRepository.save(person);
        System.out.println("为id、key为" + p.getId() + "数据做了缓存");
        return p;
    }

    @CacheEvict(value = "people")
    @Override
    public void deleteById(Long id) {
        System.out.println("删除了id、key为" + id + "的数据缓存");
        personRepository.deleteById(id);
    }

    @Cacheable(value = "people",key = "#person.id")
    @Override
    public Person findById(Person person) {
        Optional<Person> p = personRepository.findById(person.getId());
        System.out.println("为id、key为" + p.get().getId() + "数据做了缓存");
        return p.get();
    }
}
