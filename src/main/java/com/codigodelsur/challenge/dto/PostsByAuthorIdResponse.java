package com.codigodelsur.challenge.dto;

import java.util.List;

import com.codigodelsur.challenge.dao.model.Author;
import com.codigodelsur.challenge.dao.model.Post;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class PostsByAuthorIdResponse extends Author {
  Long favoriteCount;
  List<Post> posts;
}
