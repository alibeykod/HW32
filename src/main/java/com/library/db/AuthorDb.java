package com.library.db;

import com.library.model.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorDb {
    private static final List<Author> authors = new ArrayList<>();

    static {
        authors.add(new Author(1L , "Fyodor Dostoevsky"));
        authors.add(new Author(2L , "Dante Alighieri"));
        authors.add(new Author(3L , "Lev Tolstoy"));
    }

    public List<Author> getAuthors(){
        return authors;
    }

    public Author findById(Long id){
        Author found = null;
        for (Author author: authors){
            if (author.getId() == id){
                found = author;
                break;
            }
        }
        if (found == null){
            System.out.println("Author With Id [" + id + "] Has Been Not Found ❌");
        }
        return found;
    }
}
