package com.oussama.burger_traker2.controllers;

import com.oussama.burger_traker2.models.Burger;
import com.oussama.burger_traker2.services.BurgerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@Controller
public class BurgerController {
    @Autowired
    private BurgerService burgerService;

    @GetMapping("/")
    public String index( @ModelAttribute("burger") Burger burger, Model model) {
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

    @GetMapping("/edit/{id}")
    public String edit(
            @PathVariable("id") Long id,
            @ModelAttribute("burger") Burger burger,
            Model model){
        model.addAttribute("burger", burgerService.findBurger(id));
        return "edit";
    }

    @PutMapping("/update/{id}")
    public String update(
            @Valid @ModelAttribute("burger") Burger burger,
            BindingResult result,
            @PathVariable("id") Long id,
            Model model
    ){
        if(result.hasErrors()){
            model.addAttribute("burger", burger);
            return "edit";
        } else {
            burger.setId(id);
            burgerService.updateBurger(id, burger);
            return "redirect:/";
        }
    }


}