package com.example.multipledatasource.util;

public class PersonNotFoundException extends Exception{
    String message;
    public PersonNotFoundException(String message){
        this.message = message;
    }
}
