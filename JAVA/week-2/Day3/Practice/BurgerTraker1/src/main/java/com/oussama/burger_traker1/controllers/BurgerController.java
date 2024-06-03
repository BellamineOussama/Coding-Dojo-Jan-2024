package com.oussama.burger_traker1.controllers;


import com.oussama.burger_traker1.models.Burger;
import com.oussama.burger_traker1.services.BurgerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BurgerController {
    @Autowired
    private BurgerService burgerService;

    @GetMapping("/")
    public String index(Model model, @ModelAttribute("burger") Burger burger) {
        List<Burger> burgers = burgerService.allBurgers();
        model.addAttribute("burgers", burgers);
        return "index";
    }


    @PostMapping("/")
    public String create(
            @Valid @ModelAttribute("burger") Burger burger,
            BindingResult result
    ){
        if(result.hasErrors()) {
            return "index";
        } else {
            burgerService.createBurger(burger);
            return "redirect:/";
        }

    }

}
