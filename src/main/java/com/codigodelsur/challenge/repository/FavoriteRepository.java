package com.codigodelsur.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codigodelsur.challenge.dao.model.Favorite;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {

}
