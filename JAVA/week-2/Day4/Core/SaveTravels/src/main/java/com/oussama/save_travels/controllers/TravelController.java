package com.oussama.save_travels.controllers;


import com.oussama.save_travels.models.Travel;
import com.oussama.save_travels.services.TravelService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/expenses")
public class TravelController {
    @Autowired
    private TravelService travelService;

    @GetMapping("")
    public String index(@ModelAttribute("travel") Travel travel, Model model) {
        List<Travel> travels = travelService.allTravel();
        model.addAttribute("travels", travels);
        return "index";
    }

    @PostMapping("")
    public String create(
            @Valid @ModelAttribute("travel") Travel travel,
            BindingResult result
    ){
        if(result.hasErrors()){
            return "index";
        } else {
            travelService.createTravel(travel);
            return "redirect:/expenses";
        }
    }

    @GetMapping("/edit/{id}")
    public String edit (
            @PathVariable("id") Long id,
            @ModelAttribute("travel") Travel travel,
            Model model
    ){
        model.addAttribute("travel", travelService.findTravel(id));
        return "edit";
    }

    @PutMapping("/edit/{id}")
    public String update (
            @Valid @ModelAttribute("travel") Travel travel,
            BindingResult result,
            @PathVariable("id") Long id,
            Model model
    ){
        if(result.hasErrors()){
            model.addAttribute("travel", travel);
            return "edit";
        } else {
            travel.setId(id);
            travelService.updateTravel(id, travel);
            return "redirect:/expenses";
        }
    }

    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable("id") Long id){
        travelService.deleteTravel(id);
        return "redirect:/expenses";
    }


    @GetMapping("/{id}")
    public String show(Model model ,@PathVariable("id") Long id){
        Travel travel = travelService.findTravel(id);
        model.addAttribute("travel", travel);
        return "show";
    }

}
