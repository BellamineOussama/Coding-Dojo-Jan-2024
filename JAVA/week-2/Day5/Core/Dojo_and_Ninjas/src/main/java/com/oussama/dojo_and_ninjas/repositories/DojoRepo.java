package com.oussama.dojo_and_ninjas.repositories;

import com.oussama.dojo_and_ninjas.models.Dojo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long> {
    @Query("SELECT d FROM Dojo d LEFT JOIN FETCH d.ninjas WHERE d.id = :id")
    Optional<Dojo> findByIdWithNinjas(@Param("id") Long id);
    List<Dojo> findAll();

}
