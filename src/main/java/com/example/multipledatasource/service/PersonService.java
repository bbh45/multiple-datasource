package com.example.multipledatasource.service;

import com.example.multipledatasource.persondb.Person;
import com.example.multipledatasource.persondb.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;


@Service
public class PersonService {

    Logger logger = LoggerFactory.getLogger(PersonService.class);

    @Autowired
    PersonRepository personRepository;

    public void createPerson(Person person) {
        personRepository.save(person);
    }
}
