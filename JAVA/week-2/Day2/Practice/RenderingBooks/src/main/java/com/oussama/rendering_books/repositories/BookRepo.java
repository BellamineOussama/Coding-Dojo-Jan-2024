package com.oussama.rendering_books.repositories;


import com.oussama.rendering_books.models.BookModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends CrudRepository<BookModel, Long> {
    // this method retrieves all the books from the database
    List<BookModel> findAll();

}
