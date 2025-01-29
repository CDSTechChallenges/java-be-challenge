package com.codigodelsur.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigodelsur.challenge.dao.model.Author;
import com.codigodelsur.challenge.dao.model.Post;
import com.codigodelsur.challenge.dto.AuthorByIdResponse;
import com.codigodelsur.challenge.dto.PostsByAuthorIdResponse;
import com.codigodelsur.challenge.repository.AuthorRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthorService {
  private final AuthorRepository authorRepository;

  @Autowired
  private FavoriteService favoriteService;

  @Autowired
  private PostService postService;

  private final ObjectMapper mapper;

  public List<Author> getAll() {
    return authorRepository.findAll();
  }

  public AuthorByIdResponse getById(Long id) {
    Author author = authorRepository.findById(id).orElseThrow();
    Long favoriteCount = favoriteService.getCountByAuthorId(id);

    AuthorByIdResponse response = mapper.convertValue(author, AuthorByIdResponse.class);
    response.setFavoriteCount(favoriteCount);

    return response;
  }

  public PostsByAuthorIdResponse getPostsByAuthorId(Long id) {
    Author author = authorRepository.findById(id).orElseThrow();
    List<Post> posts = postService.getByAuthorId(id);

    PostsByAuthorIdResponse response = mapper.convertValue(author, PostsByAuthorIdResponse.class);
    response.setPosts(posts);

    return response;
  }

}
