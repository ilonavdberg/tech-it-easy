package com.tech_it_easy.TechItEasy.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TelevisionNotFoundException extends RuntimeException {
  public TelevisionNotFoundException() {
    super("Television Not Found!");
  }
}
