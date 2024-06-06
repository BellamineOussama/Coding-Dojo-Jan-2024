package com.oussama.book_club.repositories;

import com.oussama.book_club.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {
    List<Book> findAll();
}