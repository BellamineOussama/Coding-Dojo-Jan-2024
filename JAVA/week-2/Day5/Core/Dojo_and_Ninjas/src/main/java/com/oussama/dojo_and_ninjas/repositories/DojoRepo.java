package com.oussama.dojo_and_ninjas.repositories;

import com.oussama.dojo_and_ninjas.models.Dojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long> {
    List<Dojo> findAll();

}
