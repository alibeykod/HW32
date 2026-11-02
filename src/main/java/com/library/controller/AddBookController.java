package com.library.controller;

import com.library.model.Book;
import com.library.service.AuthorService;
import com.library.service.BookService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class AddBookController implements Controller {
    private final BookService bookService;
    private final AuthorService authorService;

    public AddBookController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @Override
    public @Nullable ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView("add-book");
        if (request.getMethod().equals("GET")) {
            modelAndView.addObject("authors", authorService.findAll());
            return modelAndView;
        }
        if (request.getMethod().equals("POST")) {
            String title = request.getParameter("title");
            Integer pages = Integer.parseInt(request.getParameter("pages"));
            Long authorId = Long.parseLong(request.getParameter("authorId"));

            long newBookId = bookService.findAll().stream()
                    .mapToLong(Book::getId)
                    .max()
                    .orElse(0L) + 1L;

            Book book = new Book(newBookId + 1, title, authorId, pages);
            bookService.add(book);
            response.sendRedirect(request.getContextPath() + "/books");
            return null;
        }
        return null;
    }


}
