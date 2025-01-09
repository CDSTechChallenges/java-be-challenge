package com.codigodelsur.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigodelsur.challenge.dao.model.Favorite;
import com.codigodelsur.challenge.service.FavoriteService;

@RestController
@RequestMapping("api/v1/favorites")
public class FavoriteController {

  @Autowired
  private FavoriteService favoriteService;

  @GetMapping
  public List<Favorite> getAll() {
    return favoriteService.getAll();
  }

  @GetMapping("/{id}")
  public Favorite getById(@PathVariable("id") final Long id) {
    return favoriteService.getById(id);
  }

}
