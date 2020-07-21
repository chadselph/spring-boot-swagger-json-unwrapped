package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

public interface Response {

  @JsonProperty
  int foo();

  @JsonUnwrapped
  Common common();
}
