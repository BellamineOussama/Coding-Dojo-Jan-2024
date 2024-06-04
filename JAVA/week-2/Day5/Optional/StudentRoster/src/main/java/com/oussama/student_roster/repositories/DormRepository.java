package com.oussama.student_roster.repositories;


import com.oussama.student_roster.models.Dorm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DormRepository extends CrudRepository<Dorm, Long> {
    List<Dorm> findAll();
}
