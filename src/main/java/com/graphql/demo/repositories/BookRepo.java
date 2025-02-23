package com.graphql.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.demo.entities.Book;

public interface BookRepo  extends JpaRepository<Book,Integer> {
    
}
