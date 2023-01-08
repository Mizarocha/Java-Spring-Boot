package com.desafio.attornatus.springboot.repositories;


import com.desafio.attornatus.springboot.entities.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
