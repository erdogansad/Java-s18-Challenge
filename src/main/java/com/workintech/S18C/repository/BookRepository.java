package com.workintech.S18C.repository;

import com.workintech.S18C.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
