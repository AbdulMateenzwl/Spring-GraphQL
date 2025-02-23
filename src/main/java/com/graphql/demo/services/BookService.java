package com.graphql.demo.services;

import java.util.List;

import com.graphql.demo.entities.Book;

public interface BookService {
    

    Book create(Book book);

    List<Book> getAll();

    Book get(int bookId);

}
