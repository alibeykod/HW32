package com.library.repository;

import com.library.db.BookDb;
import com.library.model.Book;

import java.util.List;

public class BookRepository implements BaseRepository<Book> {

    private final BookDb bookDb ;

    public BookRepository(BookDb bookDb) {
        this.bookDb = bookDb;
    }

    public void add(Book book){
        bookDb.add(book);
    }

    @Override
    public List<Book> findAll() {
        return bookDb.getBooks();
    }

    @Override
    public Book findById(Long id) {
        return bookDb.findById(id);
    }

}
