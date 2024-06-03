package com.oussama.rendering_books.controllers;


import com.oussama.rendering_books.models.BookModel;
import com.oussama.rendering_books.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books/{id}")
    public String display(Model model, @PathVariable("id") Long id ) {

        BookModel book = bookService.findBook(id);

        model.addAttribute("book", book);
        return "displayOneBook";
    }
}
