package com.library.service;

import com.library.model.Author;
import com.library.repository.AuthorRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    public Author findById(Long id){
        if (id == null || id <= 0){
            throw new RuntimeException("Invalid Id Or It's Null !!!❌");
        }
        Author found = authorRepository.findById(id);
        if (found == null ){
            throw new RuntimeException("This Book Is Forbidden Please Check Id !!!❌");
        }
        System.out.println("Author [" + found.getName() + "] Has Been Found In Database ✅");
        return found;
    }

    public List<Author> findAll(){
        return authorRepository.findAll();
    }

    public Map<Long , String> getNameMap(){
        return authorRepository.findAll().stream().collect(Collectors.toMap(
                Author::getId ,
                Author::getName
        ));
    }
}
