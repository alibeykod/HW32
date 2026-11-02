package com.library.db;

import com.library.model.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorDb {
    private static final List<Author> authors = new ArrayList<>();

    static {
        authors.add(new Author(1L, "Fyodor Dostoevsky"));
        authors.add(new Author(2L, "Dante Alighieri"));
        authors.add(new Author(3L, "Lev Tolstoy"));
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Author findById(Long id) {
        for (Author author : authors) {
            if (author.getId().equals(id)) {
                return author;
            }
        }
        System.out.println("Author By This Id [" + id + "Has Been Not Found In List ❌");
        return null;
    }
}
