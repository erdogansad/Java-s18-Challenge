package com.workintech.S18C.service;

import java.util.List;

import com.workintech.S18C.entity.Category;

public interface CategoryService {
    List<Category> findAll();

    Category findById(int id);

    Category save(Category category);

    void delete(Category category);
}