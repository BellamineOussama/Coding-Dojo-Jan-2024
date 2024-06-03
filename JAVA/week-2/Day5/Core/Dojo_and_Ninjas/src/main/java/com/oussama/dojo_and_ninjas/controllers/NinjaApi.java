package com.oussama.dojo_and_ninjas.controllers;

import com.oussama.dojo_and_ninjas.models.Ninja;
import com.oussama.dojo_and_ninjas.services.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ninjas")
public class NinjaApi {
    // DI
    private final NinjaService ninjaService;
    public NinjaApi(NinjaService ninjaService){
        this.ninjaService = ninjaService;
    }

    // READ ALL
    @GetMapping("")
    public List<Ninja> index() {
        return ninjaService.allNinjas();
    }

    // CREATE
    @PostMapping("")
    public Ninja create(
            @RequestParam(value="first_name") String first_name,
            @RequestParam(value="last_name") String last_name,
            @RequestParam(value="age") Integer age) {
        Ninja Ninja = new Ninja(first_name, last_name, age);
        return ninjaService.createNinja(Ninja);
    }

    // READ ONE BY ID
    @GetMapping("/{id}")
    public Ninja show(@PathVariable("id") Long id) {
        return ninjaService.findNinja(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Ninja update(@PathVariable("id") Long id, @RequestBody Ninja NinjaDetails) {
        return ninjaService.updateNinja(id, NinjaDetails);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        ninjaService.deleteNinja(id);
    }
}

