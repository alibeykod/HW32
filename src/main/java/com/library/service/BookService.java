package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class BookService {
    private final BookRepository bookRepository;

    @Setter
    @Getter
    private String libraryName;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(Long id) {
        if (id == null || id < 0) {
            throw new IllegalArgumentException("Id Can Not Be Null Or Negative !!! ❌❌");
        }
        Book found = bookRepository.findById(id);
        if (found == null) {
            throw new RuntimeException("Book Not Found ❌ !!!");
        }
        System.out.println("Book With Title [" + found.getTitle() + "] Has Been Found In Database ✔");
        return found;
    }

    public void add(Book book){
        if (book.getId() == null || book.getId() <= 0){
            throw new RuntimeException("Invalid Id Or Null !!!❌");
        }
        if(book.getPages() == null || book.getPages() <= 0){
            throw new RuntimeException("Invalid Pages Quantity Or Null !!!❌");
        }
        if (book.getAuthorId() == null || book.getAuthorId() <= 0){
            throw new RuntimeException("Invalid Author Id Or Null ❌!!!");
        }
        if (book.getTitle() == null || book.getTitle().isBlank()){
            throw new RuntimeException("Title Is Null Or Empty Value ❌!!!");
        }
        bookRepository.add(book);
        System.out.println("Book [" + book.getTitle() + "] Has Been Added To Library Successfully ✅");
    }


}
