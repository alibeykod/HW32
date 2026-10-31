package com.library.repository;

import java.util.List;

public interface BaseRepository<T> {
List<T> findAll();
T findById(Long id);
}
