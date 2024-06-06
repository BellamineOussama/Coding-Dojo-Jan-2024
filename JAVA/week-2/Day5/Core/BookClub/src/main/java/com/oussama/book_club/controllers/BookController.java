package com.oussama.book_club.controllers;


import com.oussama.book_club.models.Book;
import com.oussama.book_club.models.User;
import com.oussama.book_club.services.BookService;
import com.oussama.book_club.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    // ------------------------- DEPENDENCY INJECTION ---------------------------
    @Autowired
    private BookService bookService;
    @Autowired
    private UserService userService;


    // ------------------------- DISPLAY ROUTE FOR CREATE A BOOK -----------------------------
    @GetMapping("/new")
    public String newBook(@ModelAttribute("book")Book book, HttpSession session){
        //get the user id from the session
        Long userId = (Long) session.getAttribute("user_id");
        //if the user is not logged in
        if(userId == null){
            //redirect to the login page
            return "redirect:/";
        } else {
            return "newBook";
        }
    }

    // ------------------------- ACTION ROUTE TO CREATE A BOOK -----------------------------
    @PostMapping("/processBook")
    public String createBook(@Valid @ModelAttribute("book") Book book , BindingResult result, HttpSession session) {
        //get the user id from the session
        Long userId = (Long) session.getAttribute("user_id");
        //if there are errors in the form
        if(result.hasErrors()) {
            //return the new page
            return"newBook";
            //if there are no errors
        }else {
            //find the user by the id
            User user = userService.findUserById(userId);
            //set the user as the owner of the book
            book.setUser(user);
            //create the book
            Book newBook = bookService.createBook(book);
            //redirect to the show page of the car
            return "redirect:/books";
        }
    }
    // ------------------------- DISPLAY ROUTE TO SHOW ALL BOOKS -----------------------------
    @GetMapping("")
    public String home(Model model, HttpSession session) {
        //get the user id from the session
        Long userId = (Long) session.getAttribute("user_id");
        if(userId == null) {
            //redirect to the login page
            return "redirect:/";
        }
        User user = userService.findUserById(userId);
        model.addAttribute("user",user);
        List<Book> allBooks = bookService.allBooks();
        model.addAttribute("allBook",allBooks);
        return"home";
    }

    // -------------------------- SHOW ONE BOOK DETAILS ----------------------------
    @GetMapping("/{id}")
    public String showBook(@PathVariable("id")Long id, Model model, HttpSession session) {
        //get the user id from the session
        Long userId = (Long) session.getAttribute("user_id");
        if (userId == null) {
            //redirect to the login page
            return "redirect:/";
        }
        // Retrieve the user and book details
        User user = userService.findUserById(userId);
        Book book = bookService.findBook(id);
        // Add the retrieved data to the model
        model.addAttribute("book", book);
        model.addAttribute("user", user);
        // Return the view name
        return "showBook";
    }

    // -------------------------- DISPLAY ROUTE TO EDIT BOOK ----------------------------
    @GetMapping("/{id}/edit")
    public String editBook(@PathVariable("id")Long id,Model model, HttpSession session) {
        //get the user id from the session
        Long userId = (Long) session.getAttribute("user_id");
        if(userId == null) {
            //redirect to the login page
            return "redirect:/";
        }
        Book book = bookService.findBook(id);
        model.addAttribute("book",book);
        return"edit";
    }

    // ------------------------- ACTION ROUTE TO UPDATE BOOK ------------------------
    @PutMapping("/{id}/update")
    public String updateBook(@Valid @ModelAttribute("book") Book book ,BindingResult result, HttpSession session) {
        //get the user id from the session
        Long userId = (Long) session.getAttribute("user_id");
        if(result.hasErrors()) {
            return"edit";
        }else {
            //find the user by the id
            User user = userService.findUserById(userId);
            //set the user as the owner
            book.setUser(user);
            bookService.updateBook(book);
            return "redirect:/books";
        }
    }
    // ------------------------- DISPLAY ROUTE TO DELETE BOOK ------------------------
    @PostMapping("/{id}/delete")
    public String deleteBook(@PathVariable("id") Long id, RedirectAttributes flash, HttpSession session) {
        // Check if user is logged in
        Long userId = (Long) session.getAttribute("user_id");
        if (userId == null) {
            return "redirect:/";
        }
        // Delete the book
        bookService.deleteBook(id);
        flash.addFlashAttribute("success", "Awesome! You have deleted a book 📘");
        return "redirect:/books"; // Redirect back to list of all books
    }


}
