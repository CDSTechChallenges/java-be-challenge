package com.codigodelsur.challenge.dto;

import com.codigodelsur.challenge.dao.model.Author;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class AuthorByIdResponse extends Author {
  Long favoriteCount;
}
