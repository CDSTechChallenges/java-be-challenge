package com.codigodelsur.challenge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codigodelsur.challenge.dao.model.Author;
import com.codigodelsur.challenge.repository.AuthorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthorService {
  private final AuthorRepository authorRepository;

  public List<Author> getAll() {
    return authorRepository.findAll();
  }

  public Author getById(Long id) {
    return authorRepository.findById(id).orElseThrow();
  }
}
