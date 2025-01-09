package com.codigodelsur.challenge.dto;

import java.util.List;

import com.codigodelsur.challenge.dao.model.Author;
import com.codigodelsur.challenge.dao.model.Post;

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
  Long favoriteCount;
  List<Post> posts;
}
