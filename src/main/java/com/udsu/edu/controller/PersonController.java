package com.udsu.edu.controller;

import com.udsu.edu.entity.Person;
import com.udsu.edu.service.PersonService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/save_person")
    public Person save(@RequestBody String name){
        Person person = new Person(name);
        return personService.save(person);
    }
}
