package com.dc.services;

import java.util.Set;

public interface CrudService<T, I> {
    Set<T> findAll();
    T findById(I id);
    T save(T item);
    void delete(T item);
    void deleteById(I id);
}
