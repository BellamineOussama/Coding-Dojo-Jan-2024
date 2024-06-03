package com.oussama.burger_traker1.repositories;


import com.oussama.burger_traker1.models.Burger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BurgerRepo extends CrudRepository<Burger, Long> {
    List<Burger> findAll();
}
