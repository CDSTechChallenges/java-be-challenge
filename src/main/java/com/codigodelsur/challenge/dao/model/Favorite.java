package com.codigodelsur.challenge.dao.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Favorite {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("authorId")
  private String authorId;

  @JsonProperty("postId")
  private String postId;

  @JsonProperty("createdAt")
  private LocalDateTime createdAt;

  @JsonProperty("updatedAt")
  private LocalDateTime updatedAt;
}
