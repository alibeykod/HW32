package com.library.controller;

import com.library.model.Author;
import com.library.service.AuthorService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.List;

public class AuthorListController implements Controller {
    private final AuthorService authorService;

    public AuthorListController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Override
    public @Nullable ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView("authors");
        List<Author> authors = authorService.findAll();
        modelAndView.addObject("authors" , authors);
        return modelAndView;
    }
}
