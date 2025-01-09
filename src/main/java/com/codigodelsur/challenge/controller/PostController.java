package com.codigodelsur.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigodelsur.challenge.dao.model.Post;
import com.codigodelsur.challenge.service.PostService;

@RestController
@RequestMapping("api/v1/posts")
public class PostController {

  @Autowired
  private PostService postService;

  @GetMapping
  public List<Post> getAll() {
    return postService.getAll();
  }

  @GetMapping("/{id}")
  public Post getById(@PathVariable final Long id) {
    return postService.getById(id);
  }

}
