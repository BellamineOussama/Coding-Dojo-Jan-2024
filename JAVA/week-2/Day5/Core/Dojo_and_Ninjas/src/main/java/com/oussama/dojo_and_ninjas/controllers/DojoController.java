package com.oussama.dojo_and_ninjas.controllers;


import com.oussama.dojo_and_ninjas.models.Dojo;
import com.oussama.dojo_and_ninjas.services.DojoService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/dojos")
public class DojoController {


    private final DojoService dojoService;
    public DojoController (DojoService dojoService) {
        this.dojoService = dojoService;
    }

    // --------------------- Display Route --------------------------------
    @GetMapping("/new")
    public String dojos (Model model, @ModelAttribute("dojo") Dojo dojo) {
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("allDojos", dojos);
        return "dojos/dojo";
    }

    // -------------------------------- ACTION ROUTE --------------------------
    @PostMapping("/new")
    public String createDojo(
            @Valid @ModelAttribute("dojo") Dojo dojo,
            BindingResult result,
            Model model){
        if(result.hasErrors()){
            List<Dojo> dojos = dojoService.allDojos();
            model.addAttribute("allDojos", dojos);
            return "dojos/dojo";
        } else {
            dojoService.createDojo(dojo);
            return "redirect:/dojos";
        }
    }

    // New route to display a specific dojo with its ninjas
    @GetMapping("/{id}")
    public String showDojo(@PathVariable("id") Long id, Model model) {
        Dojo dojo = dojoService.findDojo(id);
        model.addAttribute("dojo", dojo);
        return "dojos/show";
    }
}

