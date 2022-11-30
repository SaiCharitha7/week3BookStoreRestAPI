package com.week3.BookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.week3.BookStore.Model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
