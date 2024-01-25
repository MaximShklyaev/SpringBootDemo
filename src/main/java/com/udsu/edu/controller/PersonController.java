package com.udsu.edu.controller;

import com.udsu.edu.entity.Person;
import com.udsu.edu.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/savePerson")
    public Person save(@RequestBody String name){
        Person person = new Person(name);
        return personService.save(person);
    }

}
