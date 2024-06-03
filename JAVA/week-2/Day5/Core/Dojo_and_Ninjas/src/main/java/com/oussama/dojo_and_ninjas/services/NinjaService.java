package com.oussama.dojo_and_ninjas.services;


import com.oussama.dojo_and_ninjas.models.Ninja;
import com.oussama.dojo_and_ninjas.repositories.NinjaRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    // adding the Ninja repository as a dependency
    private final NinjaRepo NinjaRepository;

    public NinjaService(NinjaRepo NinjaRepository) {
        this.NinjaRepository = NinjaRepository;
    }

    // ========== CURD =============

    // READ ALL
    public List<Ninja> allNinjas() {
        return NinjaRepository.findAll();
    }

    // CREATE
    public Ninja createNinja(Ninja b) {
        return NinjaRepository.save(b);
    }

    // READ ONE
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = NinjaRepository.findById(id);
        return optionalNinja.orElse(null);
    }

    // UPDATE
    public Ninja updateNinja(Long id, Ninja NinjaDetails) {
        Optional<Ninja> optionalNinja = NinjaRepository.findById(id);
        if (optionalNinja.isPresent()) {
            Ninja Ninja = optionalNinja.get();
            Ninja.setFirst_name(NinjaDetails.getFirst_name());
            Ninja.setLast_name(NinjaDetails.getLast_name());
            Ninja.setAge(NinjaDetails.getAge());
            return NinjaRepository.save(Ninja); // Save updates to the repository
        } else {
            // Handle the case where the Ninja is not found
            return null; // or throw a custom exception
        }
    }

    // DELETE
    public void deleteNinja(Long id) {
        NinjaRepository.deleteById(id);
    }

}

