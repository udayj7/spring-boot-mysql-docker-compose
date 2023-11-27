package com.uday.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uday.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
