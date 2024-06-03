package com.oussama.save_travels.repositories;


import com.oussama.save_travels.models.Travel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravelRepo extends CrudRepository<Travel, Long> {
    List<Travel> findAll();
}