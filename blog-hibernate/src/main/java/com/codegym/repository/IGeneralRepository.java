package com.codegym.repository;

import java.util.List;

public interface IGeneralRepository<E> {
    List<E> findAll();

    E findById(Long id);

    void save(E model);

    void remove(Long id);
}
