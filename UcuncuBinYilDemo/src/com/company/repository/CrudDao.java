package com.company.repository;

import java.util.List;

public interface CrudDao<T> {

    T save(T entity);

    T findById(Long id);

    List<T> findAll();

    boolean deleteById(Long id);

    T update(T entity);
}
