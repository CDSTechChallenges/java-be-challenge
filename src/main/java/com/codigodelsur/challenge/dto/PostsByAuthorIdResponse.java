package com.codigodelsur.challenge.dto;

import java.util.Set;

import com.codigodelsur.challenge.dao.model.Author;
import com.codigodelsur.challenge.dao.model.Post;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostsByAuthorIdResponse extends Author {
  @JsonProperty("posts")
  Set<Post> posts;
}
