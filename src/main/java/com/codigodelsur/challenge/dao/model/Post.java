package com.codigodelsur.challenge.dao.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("title")
  private String title;

  @JsonProperty("content")
  private String content;

  @JsonProperty("authorId")
  private String authorId;

  @JsonProperty("createdAt")
  private LocalDateTime createdAt;

  @JsonProperty("updatedAt")
  private LocalDateTime updatedAt;
}
