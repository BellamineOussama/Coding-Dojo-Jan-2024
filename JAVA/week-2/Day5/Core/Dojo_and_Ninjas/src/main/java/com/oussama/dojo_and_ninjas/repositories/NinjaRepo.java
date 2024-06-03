package com.oussama.dojo_and_ninjas.repositories;

import com.oussama.dojo_and_ninjas.models.Ninja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long> {
    List<Ninja>  findAll();

}
