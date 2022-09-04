package com.example.multipledatasource.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Configuration
@ControllerAdvice
public class ExceptionHandlerConfig {

    @ExceptionHandler(PersonNotFoundException.class)
    public ResponseEntity handlePersonNotFoundException(PersonNotFoundException ex){
        return new ResponseEntity(ex.message, HttpStatus.NOT_FOUND);
    }
}
