package com.oussama.rendering_books.controllers;


import com.oussama.rendering_books.models.BookModel;
import com.oussama.rendering_books.services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksApi {

    // Constructor Injection (DI)
    private final BookService bookService;
    public BooksApi(BookService bookService) {
        this.bookService = bookService;
    }

    // METHOD TO GET A LIST OF ALL BOOKS
    @GetMapping("")
    public List<BookModel> index() {
        return bookService.allBooks();
    }

    // METHOD TO FIND BOOK BY ID
    @GetMapping("/{id}")
    public BookModel find(@PathVariable("id") Long id) {
        return bookService.findBook(id);
    }

    // METHOD TO CREATE A BOOK
    @PostMapping("")
    public BookModel create(
            @RequestParam("title") String title,
            @RequestParam("description") String description,
            @RequestParam("language") String language,
            @RequestParam("pages") Integer numberOfPages
    ){
        BookModel book = new BookModel(title, description, language, numberOfPages);
        return bookService.createBook(book);
    }

    // METHOD TO UPDATE AN EXISTING BOOK RESOURCE IDENTIFIED BY ITS ID
    @PutMapping("/{id}")
    public BookModel update(
            @PathVariable("id") Long id,
            @RequestParam("title") String title,
            @RequestParam("description") String description,
            @RequestParam("language") String language,
            @RequestParam("pages") Integer numberOfPages) {
        BookModel book = new BookModel(title, description, language, numberOfPages);
        return bookService.updateBook(id, book);

    }

    // METHOD TO DELETE AN EXISTING BOOK RESOURCE IDENTIFIED BY ITS ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        bookService.deleteBook(id);

    }

}