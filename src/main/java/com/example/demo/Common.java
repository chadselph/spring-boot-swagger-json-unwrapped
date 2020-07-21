package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

public interface Common {
  @Schema(required = true)
  @JsonProperty
  String page();
}
