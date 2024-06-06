package com.oussama.book_club.services;

import com.oussama.book_club.models.Book;
import com.oussama.book_club.repositories.BookRepo;
import org.eclipse.tags.shaded.org.apache.bcel.generic.PUSH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    // adding the book repository as a dependency (DEPENDENCY INJECTION)
    @Autowired
    private BookRepo bookRepo;


    // -------------------------- FULL CURD --------------------------

    // ***** CREATE *****
    public Book createBook(Book book) {
        return bookRepo.save(book);
    }

    // ***** READ ALL *****
    public List<Book> allBooks() {
        return bookRepo.findAll();
    }

    // ***** READ ONE BY ID *****
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        return optionalBook.orElse(null);
    }

    // ***** EDIT (UPDATE) *****
    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }

    // ***** DELETE ONE BY ID *****
    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }

}
