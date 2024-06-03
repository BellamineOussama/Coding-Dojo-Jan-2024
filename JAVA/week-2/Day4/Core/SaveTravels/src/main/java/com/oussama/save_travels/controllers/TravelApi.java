package com.oussama.save_travels.controllers;

import com.oussama.save_travels.models.Travel;
import com.oussama.save_travels.services.TravelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TravelApi {

    // CONSTRUCTOR INJECTION
    private final TravelService travelService;
    public TravelApi(TravelService travelService){
        this.travelService = travelService;
    }

    // GET LIST OF ALL TRAVELS
    @GetMapping("")
    public List<Travel> index() {
        return travelService.allTravel();
    }

    // FIND TRAVEL BY ID
    @GetMapping("/{id}")
    public Travel find (@PathVariable("id") Long id) {
        return travelService.findTravel(id);
    }

    // CREATE TRAVEL
    @PostMapping("")
    public Travel create(
            @RequestParam("expense") String expense,
            @RequestParam("vendor") String vendor,
            @RequestParam("amount") double amount,
            @RequestParam("description") String description
    ){
        Travel travel = new Travel(expense, vendor, amount, description);
        return travelService.createTravel(travel);
    }

    // UPDATE TRAVEL
    @PutMapping("/{id}")
    public Travel update(
            @PathVariable("id") Long id,
            @RequestParam("expense") String expense,
            @RequestParam("vendor") String vendor,
            @RequestParam("amount") double amount,
            @RequestParam("description") String description
    ){
        Travel travel = new Travel(expense, vendor, amount, description);
        return travelService.updateTravel(id, travel);
    }

    //DELETE TRAVEL
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        travelService.deleteTravel(id);
    }


}
