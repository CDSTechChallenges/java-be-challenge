package com.codigodelsur.challenge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codigodelsur.challenge.dao.model.Favorite;
import com.codigodelsur.challenge.repository.FavoriteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FavoriteService {
  private final FavoriteRepository favoriteRepository;

  public List<Favorite> getAll() {
    return favoriteRepository.findAll();
  }

  public Favorite getById(Long id) {
    return favoriteRepository.findById(id).orElseThrow();
  }

  public Long getCountByAuthorId(Long authorId) {
    return favoriteRepository.countByAuthorId(authorId);
  }
}
