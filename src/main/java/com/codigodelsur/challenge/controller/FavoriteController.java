package com.codigodelsur.challenge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigodelsur.challenge.dao.model.Favorite;

@RestController
@RequestMapping("api/v1/favorites")
public class FavoriteController {
  @GetMapping
  public Favorite getAll() {
    return new Favorite();
  }

}
