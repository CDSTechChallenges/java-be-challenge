package com.codigodelsur.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codigodelsur.challenge.dao.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
