package com.codegym.service;

import com.codegym.model.Blog;

import java.util.List;

public interface IGeneralService<E> {
    List<E> findAll();

    E findById(Long id);

    void save(Blog blog);

    void remove(Long id);
}
