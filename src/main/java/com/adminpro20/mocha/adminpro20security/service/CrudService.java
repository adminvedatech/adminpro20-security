package com.adminpro20.mocha.adminpro20security.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T, ID> {

    List<T> findAll();

    Optional<T> findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

    void saveAll(List<T> object);
}