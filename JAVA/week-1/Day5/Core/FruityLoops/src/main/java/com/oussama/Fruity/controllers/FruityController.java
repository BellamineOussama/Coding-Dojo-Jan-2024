package com.oussama.Fruity.controllers;


import com.oussama.Fruity.models.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class FruityController {
    @RequestMapping("/")
    public String fruity (Model model) {
        ArrayList<Item> fruits = new ArrayList<>();
        fruits.add(new Item("Kiwi", 1.5));
        fruits.add(new Item("Mango", 2.0));
        fruits.add(new Item("Goji Berries", 4.0));
        fruits.add(new Item("Guava", .75));

        // Add fruits to your view model here
        model.addAttribute("fruits", fruits);
        return  "fruity";
    }


}
