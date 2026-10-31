package com.library.repository;

import com.library.db.AuthorDb;
import com.library.model.Author;

import java.util.List;

public class AuthorRepository implements BaseRepository<Author>{
    private final AuthorDb authorDb;

    public AuthorRepository(AuthorDb authorDb) {
        this.authorDb = authorDb;
    }

    @Override
    public List<Author> findAll() {
       return authorDb.getAuthors();
    }

    @Override
    public Author findById(Long id) {
        return authorDb.findById(id);
    }
}
