package com.oussama.booksapi.services;


import com.oussama.booksapi.models.BookModel;
import com.oussama.booksapi.repositories.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    // adding the book repository as a dependency
    private final BookRepo bookRepository;

    public BookService(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }

    // READ ALL THE BOOK
    public List<BookModel> allBooks() {
        return bookRepository.findAll();
    }

    // CREATE A Book
    public BookModel createBook(BookModel book){
        return bookRepository.save(book);
    }

    // FIND ONE BOOK BY ID
    public BookModel findBook(Long id){
        Optional<BookModel> optionalBook = bookRepository.findById(id);
        return optionalBook.orElse(null);
    }

    // UPDATE A BOOK
    public BookModel updateBook(Long id, BookModel bookDetails){
        Optional<BookModel> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            BookModel book = optionalBook.get();
            book.setTitle(bookDetails.getTitle());
            book.setDescription(bookDetails.getDescription());
            book.setLanguage(bookDetails.getLanguage());
            book.setNumberOfPages(bookDetails.getNumberOfPages());
            return bookRepository.save(book);
        } else {
            return null;
        }
    }

    // DELETE BOOK
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }


}
