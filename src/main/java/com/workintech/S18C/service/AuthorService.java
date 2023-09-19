package com.workintech.S18C.service;

import java.util.List;

import com.workintech.S18C.entity.Author;

public interface AuthorService {
    List<Author> findAll();

    Author findById(int id);

    Author save(Author author);

    void delete(Author author);
}