package com.desafio.attornatus.springboot.controller;

import com.desafio.attornatus.springboot.entities.Person;
import com.desafio.attornatus.springboot.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/peoples")
public class PersonController {
    @Autowired
    private PersonRepository repository;

    @GetMapping
    public List<Person> findAll() {
        List<Person> result = repository.findAll();
        return result;

    }

    @GetMapping(value = "/{id}")
    public Person findById(@PathVariable Long id) {
        Person result = repository.findById(id).get();
        return result;

    }

    @PostMapping
    public Person insert(@RequestBody Person person) {
        Person result = repository.save(person);
        return result;


    }
}