package com.codigodelsur.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigodelsur.challenge.dao.model.Author;
import com.codigodelsur.challenge.service.AuthorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/authors")
public class AuthorController {

  @Autowired
  private AuthorService authorService;

  @GetMapping
  public List<Author> getAll() {
    return authorService.getAll();
  }

  @GetMapping("/{id}")
  public Author getById(@PathVariable final Long id) {
    return authorService.getById(id);
  }

  // /:authorId/posts
  // /:authorId/favorites
}
