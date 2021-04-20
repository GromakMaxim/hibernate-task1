package com.example.hibernate1.controller;

import com.example.hibernate1.repository.PersonRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonsController {

    private PersonRepository personRepository;

    public PersonsController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping("/persons/by-city")
    public List userDetails(@RequestParam String city) {
        return personRepository.getPersonsByCity(city);
    }
}
