package com.oussama.dojo_and_ninjas.controllers;


import com.oussama.dojo_and_ninjas.models.Dojo;
import com.oussama.dojo_and_ninjas.models.Ninja;
import com.oussama.dojo_and_ninjas.services.DojoService;
import com.oussama.dojo_and_ninjas.services.NinjaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    NinjaService ninjaService;

    @Autowired
    DojoService dojoService;

    @GetMapping("/new")
    public String ninja(Model model) {
        List<Dojo> allDojo = dojoService.allDojos();
        model.addAttribute("ninja", new Ninja());
        model.addAttribute("allDojo", allDojo);
        return "createNinja";
    }

    @PostMapping("/new")
    public String create(
            @Valid @ModelAttribute("ninja") Ninja ninja,
            BindingResult result,
            Model model,
            RedirectAttributes flash) {
        if (result.hasErrors()) {
            List<Dojo> allDojo = dojoService.allDojos();
            model.addAttribute("allDojo", allDojo);
            return "createNinja";
        } else {
            ninjaService.createNinja(ninja);
            flash.addFlashAttribute("success", "Awesome! You have added a new ninja 🥷 ");
            return "redirect:/ninjas/dojo/" + ninja.getDojo().getId(); // Redirect to display all ninjas of the dojo
        }
    }

    @GetMapping("/dojo/{dojoId}")
    public String listNinjas(@PathVariable Long dojoId, Model model) {
        Dojo dojo = dojoService.findDojo(dojoId);
        if (dojo != null) {
            model.addAttribute("dojo", dojo);
            return "listNinjas"; // Ensure this matches your JSP file for listing ninjas
        } else {
            return "redirect:/dojos"; // Redirect to a suitable page if the dojo is not found
        }
    }
}
