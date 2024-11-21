package com.tech_it_easy.TechItEasy.controllers;

import com.tech_it_easy.TechItEasy.exceptions.TelevisionNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = TelevisionNotFoundException.class)
    public ResponseEntity<Object> exception(TelevisionNotFoundException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
}
