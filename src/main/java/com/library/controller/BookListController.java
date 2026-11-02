package com.library.controller;


import com.library.model.Book;
import com.library.service.AuthorService;
import com.library.service.BookService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.List;
import java.util.Map;

public class BookListController implements Controller {
    private final BookService bookService;
    private final AuthorService authorService;

    public BookListController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }


    @Override
    public @Nullable ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        List<Book> allBooks = bookService.findAll();
        Map<Long, String> authorMap = authorService.getNameMap();
        String libraryName = bookService.getLibraryName();

        ModelAndView modelAndView = new ModelAndView("books");
        modelAndView.addObject("books" , allBooks);
        modelAndView.addObject("authorNames" ,authorMap);
        modelAndView.addObject("libraryName" , libraryName);
        return modelAndView;
    }
}
