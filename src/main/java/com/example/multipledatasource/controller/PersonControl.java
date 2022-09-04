package com.example.multipledatasource.controller;

import com.example.multipledatasource.persondb.Person;
import com.example.multipledatasource.service.PersonService;
import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@ToString
@RestController
public class PersonControl {

    Logger logger = LoggerFactory.getLogger(PersonControl.class);

    @Autowired
    PersonService personService;

    @PostMapping("/person")
    public void createPerson(@RequestBody Person person) {
        logger.info("Person : {}",person.toString());
        personService.createPerson(person);
    }
}
