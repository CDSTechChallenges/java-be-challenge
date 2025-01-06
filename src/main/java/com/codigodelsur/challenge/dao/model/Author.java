package com.codigodelsur.challenge.dao.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Author {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("createdAt")
  private LocalDateTime createdAt;

  @JsonProperty("updatedAt")
  private LocalDateTime updatedAt;
}
