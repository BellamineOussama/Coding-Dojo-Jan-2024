package com.oussama.book_club.controllers;

import com.oussama.book_club.models.LoginUser;
import com.oussama.book_club.models.User;
import com.oussama.book_club.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    // -------------------------------- DISPLAY ROUTE (LOGIN & REGISTER) --------------------------------
    @GetMapping("/")
    public String index(Model model) {
        // Bind empty User and LoginUser objects to the JSP
        // to capture the form input
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "Login-Register/login";
    }

    // -------------------------------- ACTION ROUTE REGISTER--------------------------------
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser,
                           BindingResult result, HttpSession session, Model model) {
        // 1. Execute the Service Method
        User registeredUser = userService.register(newUser, result);
        System.out.println(registeredUser);
        if(result.hasErrors()) {

            // re-rendering the page.
            model.addAttribute("newLogin", new LoginUser());
            return "Login-Register/login";
        } else {
            session.setAttribute("user_id",newUser.getId());
            return "redirect:/books";
        }
    }

    // -------------------------------- ACTION ROUTE LOGIN--------------------------------
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, HttpSession session, Model model){
        // pass the newLogin object to the login method in the service
        User user = userService.login(newLogin, result);
        // if there are errors
        if(result.hasErrors()){
            // pass the newUser object to the login page for registration
            model.addAttribute("newUser", new User());
            // return the login page
            return "Login-Register/login";
        }else{
            // set the user id in session
            session.setAttribute("user_id", user.getId());
            // redirect to the books route
            return "redirect:/books";
        }
    }


    // -------------------------------- DISPLAY LOGOUT ROUTE --------------------------------
    @GetMapping("/logout")
    public String logout(HttpSession session){
        // invalidate session
        session.invalidate();
        // redirect to the index route
        return "redirect:/";
    }
}