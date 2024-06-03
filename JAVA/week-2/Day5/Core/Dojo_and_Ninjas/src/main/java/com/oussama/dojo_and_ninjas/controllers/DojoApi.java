package com.oussama.dojo_and_ninjas.controllers;


import com.oussama.dojo_and_ninjas.models.Dojo;
import com.oussama.dojo_and_ninjas.services.DojoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dojos")
public class DojoApi {
    // DI
    private final DojoService dojoService;
    public DojoApi(DojoService dojoService){
        this.dojoService = dojoService;
    }

    // READ ALL
    @GetMapping("")
    public List<Dojo> index() {
        return dojoService.allDojos();
    }

    // CREATE
    @PostMapping("")
    public Dojo create( @RequestParam(value="name") String name) {
        Dojo Dojo = new Dojo(name);
        return dojoService.createDojo(Dojo);
    }

    // READ ONE BY ID
    @GetMapping("/{id}")
    public Dojo show(@PathVariable("id") Long id) {
        return dojoService.findDojo(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Dojo update(@PathVariable("id") Long id, @RequestBody Dojo DojoDetails) {
        return dojoService.updateDojo(id, DojoDetails);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        dojoService.deleteDojo(id);
    }


}

