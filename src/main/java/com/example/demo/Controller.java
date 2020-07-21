package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping(path = "/api")
  public Response get() {
    throw new UnsupportedOperationException("Not implemented for min example");
  }
}
