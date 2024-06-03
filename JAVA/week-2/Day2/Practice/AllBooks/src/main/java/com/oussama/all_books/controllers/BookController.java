package com.oussama.all_books.controllers;


import com.oussama.all_books.models.BookModel;
import com.oussama.all_books.services.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

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

    @GetMapping ("/books")
    public String index(Model model){
        List<BookModel> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "index";
    }



    @GetMapping("/books/new")
    public String newBook(@ModelAttribute("book") BookModel book){
        return "new";
    }
    @PostMapping("/books")
    public String create(
            @Valid @ModelAttribute("book") BookModel book,
            BindingResult result){

        if(result.hasErrors()){
            return "new";
        } else {
            bookService.createBook(book);
            return "redirect:/books";
        }
    }

}
