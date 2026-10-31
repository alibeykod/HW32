package com.library.controller;

import com.library.model.Book;
import com.library.service.AuthorService;
import com.library.service.BookService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class BookDetailController implements Controller {
    private final BookService bookService;
    private final AuthorService authorService;

    public BookDetailController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @Override
    public @Nullable ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Long id = Long.parseLong(request.getParameter("id"));

        Book foundBook = bookService.findById(id);
        String authorsName = authorService.findById(foundBook.getAuthorId()).getName();
        if (foundBook.getId() == null){
            return null;
        }
        ModelAndView modelAndView = new ModelAndView("book-detail");
        modelAndView.addObject("book" , foundBook);
        modelAndView.addObject("author'sName" , authorsName);

        return modelAndView;
    }
}
