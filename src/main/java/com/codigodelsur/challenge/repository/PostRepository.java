package com.codigodelsur.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codigodelsur.challenge.dao.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
  List<Post> getByAuthorId(Long authorId);
}
