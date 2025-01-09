package com.codigodelsur.challenge.dto;

import com.codigodelsur.challenge.dao.model.Author;

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
public class AuthorByIdResponse extends Author {
  Long favoriteCount;
}
