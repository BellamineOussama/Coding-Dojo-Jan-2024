package com.oussama.burger_traker1.services;


import com.oussama.burger_traker1.models.Burger;
import com.oussama.burger_traker1.repositories.BurgerRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BurgerService {

    // adding the burger repository as a dependency
    private final BurgerRepo burgerRepository;
    public BurgerService(BurgerRepo burgerRepository){
        this.burgerRepository = burgerRepository;
    }

    // READ ALL
    public List<Burger> allBurgers() {
        return burgerRepository.findAll();
    }

    // CREATE A BURGER
    public Burger createBurger (Burger burger){
        return burgerRepository.save(burger);
    }

    // FIND ON BURGER BY ID
    public Burger findBurger(Long id){
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        return optionalBurger.orElse(null);
    }

    // UPDATE BURGER
    public Burger updateBurger(Long id, Burger burgerDetails){
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        if(optionalBurger.isPresent()){
            Burger burger = optionalBurger.get();
            burger.setNameOfBurger(burgerDetails.getNameOfBurger());
            burger.setRestaurant(burgerDetails.getRestaurant());
            burger.setRating(burgerDetails.getRating());
            return burgerRepository.save(burger);
        } else {
            return null;
        }
    }

    // DELETE BURGER
    public void deleteBurger(Long id){
        burgerRepository.deleteById(id);
    }



}
