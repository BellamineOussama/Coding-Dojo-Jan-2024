package com.oussama.dojo_and_ninjas.services;


import com.oussama.dojo_and_ninjas.models.Dojo;
import com.oussama.dojo_and_ninjas.repositories.DojoRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoService {
    // adding the Dojo repository as a dependency
    private final DojoRepo dojoRepository;

    public DojoService(DojoRepo dojoRepository) {
        this.dojoRepository = dojoRepository;
    }

    // ========== CURD =============

    // READ ALL
    public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }

    // CREATE
    public Dojo createDojo(Dojo b) {
        return dojoRepository.save(b);
    }

    // READ ONE
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        return optionalDojo.orElse(null);
    }

    // UPDATE
    public Dojo updateDojo(Long id, Dojo DojoDetails) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if (optionalDojo.isPresent()) {
            Dojo Dojo = optionalDojo.get();
            Dojo.setName(DojoDetails.getName());
            return dojoRepository.save(Dojo); // Save updates to the repository
        } else {
            // Handle the case where the Dojo is not found
            return null; // or throw a custom exception
        }
    }

    // DELETE
    public void deleteDojo(Long id) {
        dojoRepository.deleteById(id);
    }

}

