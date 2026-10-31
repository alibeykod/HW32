package com.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    //    Book Long id, String title, Long authorId, int pages
    private Long id;
    private String title;
    private Long authorId;
    private Integer pages;
}
