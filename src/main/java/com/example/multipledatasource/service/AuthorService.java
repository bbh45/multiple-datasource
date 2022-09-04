package com.example.multipledatasource.service;

import com.example.multipledatasource.authordb.Author;
import com.example.multipledatasource.authordb.AuthorRepository;
import com.example.multipledatasource.util.PersonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public void createAuthor(Author author) {
        authorRepository.save(author);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthor(Integer id) throws PersonNotFoundException {
        return authorRepository.findById(id).orElseThrow(() -> new PersonNotFoundException("Person with id: "+id+" not present"));
    }
}
