package com.codigodelsur.challenge.dao.model;

import java.time.LocalDateTime;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {
  @Id
  @JsonProperty("id")
  private Long id;

  @Basic
  @JsonProperty("title")
  private String title;

  @Basic
  @JsonProperty("content")
  private String content;

  @OneToMany(mappedBy = "post")
  private Set<Favorite> favorites;

  @ManyToOne
  @JsonProperty
  private Author author;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
  private LocalDateTime createdAt;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
  private LocalDateTime updatedAt;
}
