package com.workintech.S18C.service;

import java.util.List;

import com.workintech.S18C.entity.Book;

public interface BookService {
    List<Book> findAll();

    Book findById(int id);

    Book save(Book book);

    void delete(Book book);
}