package com.example.multipledatasource.controller;

import com.example.multipledatasource.authordb.Author;
import com.example.multipledatasource.service.AuthorService;
import com.example.multipledatasource.util.PersonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/author")
    public void createAuthor(@RequestBody Author author){
        authorService.createAuthor(author);
    }

    @GetMapping("/author/all")
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthors();
    }

    @GetMapping("/author/{id}")
    public Author getAuthor(@PathVariable("id") Integer id) throws PersonNotFoundException {
        return authorService.getAuthor(id);
    }

}
