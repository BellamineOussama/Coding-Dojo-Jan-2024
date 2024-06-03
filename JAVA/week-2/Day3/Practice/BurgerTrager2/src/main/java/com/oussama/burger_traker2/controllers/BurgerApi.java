package com.oussama.burger_traker2.controllers;


import com.oussama.burger_traker2.models.Burger;
import com.oussama.burger_traker2.services.BurgerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BurgerApi {

    // CONSTRUCTOR INJECTION
    private final BurgerService burgerService;
    public BurgerApi(BurgerService burgerService){
        this.burgerService = burgerService;
    }

    // GET LIST OF ALL BURGER
    @GetMapping("")
    public List<Burger> index() {
        return burgerService.allBurgers();
    }

    // FIND BURGER BY ID
    @GetMapping("/{id}")
    public Burger find (@PathVariable("id") Long id){
        return burgerService.findBurger(id);
    }

    // CREATE BURGER
    @PostMapping("")
    public Burger create (
            @RequestParam("nameOfBurger") String nameOfBurger,
            @RequestParam("restaurant") String restaurant,
            @RequestParam("rating") int rating,
            @RequestParam("notes") String notes
    ){
        Burger burger = new Burger(nameOfBurger, restaurant, rating, notes);
        return burgerService.createBurger(burger);
    }

    // UPDATE BURGER
    @PutMapping("/{id}")
    public Burger update(
            @PathVariable("id") Long id,
            @RequestParam("nameOfBurger") String nameOfBurger,
            @RequestParam("restaurant") String restaurant,
            @RequestParam("rating") int rating,
            @RequestParam("notes") String notes
    ){
        Burger burger = new Burger(nameOfBurger, restaurant, rating, notes);
        return burgerService.updateBurger(id, burger);
    }

    // DELETE BURGER
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        burgerService.deleteBurger(id);
    }
}
