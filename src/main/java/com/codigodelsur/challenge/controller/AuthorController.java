package com.codigodelsur.challenge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigodelsur.challenge.dao.model.Author;

@RestController
@RequestMapping("api/v1/authors")
public class AuthorController {
  @GetMapping
  public Author getAll() {
    return new Author();
  }

  // /:authorId
  // /:authorId/posts
  // /:authorId/favorites
}
