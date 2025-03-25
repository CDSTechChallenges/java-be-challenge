package com.codigodelsur.challenge.dao.model;

import java.time.LocalDateTime;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "authors")
public class Author {
  @Id
  @JsonProperty("id")
  private Long id;

  @Basic
  @JsonProperty("name")
  private String name;

  @OneToMany(mappedBy = "author")
  @JsonIgnore
  private Set<Post> posts;

  @OneToMany(mappedBy = "author")
  @JsonIgnore
  private Set<Favorite> favorites;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
  private LocalDateTime createdAt;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
  private LocalDateTime updatedAt;

  public void setPosts(Set<Post> posts) {
    this.posts = posts;
  }
}
