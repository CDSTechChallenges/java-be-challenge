package com.codigodelsur.challenge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codigodelsur.challenge.dao.model.Post;
import com.codigodelsur.challenge.repository.PostRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
  private final PostRepository postRepository;

  public List<Post> getAll() {
    return postRepository.findAll();
  }

  public Post getById(Long id) {
    return postRepository.findById(id).orElseThrow();
  }

  public List<Post> getByAuthorId(Long id) {
    return postRepository.getByAuthorId(id);
  }
}
