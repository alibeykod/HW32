package com.library.db;

import com.library.model.Book;

import java.util.ArrayList;
import java.util.List;


public class BookDb {
    private final static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book(1L, "Clean Code", 1L, 250));
        books.add(new Book(2L, "A Good Girl's Guide to Murder", 2L, 100));
        books.add(new Book(3L, "The Book Thief", 3L, 1400));
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book findById(Long id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        System.out.println("There Is No Book With ID => " + id);
        return null;
    }

    public void add(Book book) {
        try {
            books.add(book);
            System.out.println("Book + " + book.getTitle() + "Has Been Added Successfully 📗 => 📚 : ✔ ");
        } catch (RuntimeException e) {
            System.out.println("Book + " + book.getTitle() + " Failed To Add 📗 => 📚 : ❌ because : " + e.getMessage());
        }
    }
}
