package com.oussama.login_and_registration.controllers;

import com.oussama.login_and_registration.models.LoginUser;
import com.oussama.login_and_registration.models.User;
import com.oussama.login_and_registration.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class UserController {

    @Autowired
    private UserService userService;


    // -------------------------------- DISPLAY ROUTE FOR ONE USER--------------------------------
    @GetMapping("welcome/{id}")
    public String home(Model model,@PathVariable("id") Long id) {
        User thisUser = userService.findOne(id);
        model.addAttribute("user", thisUser);
        return "welcome";
    }


    // -------------------------------- DISPLAY ROUTE --------------------------------
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
            return "redirect:/welcome/" +registeredUser.getId();
        }
    }

    // -------------------------------- ACTION ROUTE LOGIN--------------------------------
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, HttpSession session, Model model){
        // pass the newLogin object to the login method in the service
        User user = userService.login(newLogin, result);
        // if there are errors
        if(result.hasErrors()){
            // pass the newUser object to the index page for registration
            model.addAttribute("newUser", new User());
            // return the index page
            return "Login-Register/login";
        }else{
            // set the user id in session
            session.setAttribute("user_id", user.getId());
            // redirect to the books route
            return "redirect:/welcome/" + user.getId();
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
