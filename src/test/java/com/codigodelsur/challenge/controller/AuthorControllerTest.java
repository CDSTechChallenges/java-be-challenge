package com.codigodelsur.challenge.controller;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import com.codigodelsur.challenge.AbstractTest;

public class AuthorControllerTest extends AbstractTest {
  @Test
  public void getByPublicId_shouldReturn200() throws Exception {
    // When
    ResultActions result = this.mockMvc.perform(get("/api/v1/authors/{id}", 1));

    // Then
    result
        .andExpect(status().isOk())
        .andExpect(jsonPath("$..id").exists())
        .andExpect(jsonPath("$..name").exists());
  }
}
