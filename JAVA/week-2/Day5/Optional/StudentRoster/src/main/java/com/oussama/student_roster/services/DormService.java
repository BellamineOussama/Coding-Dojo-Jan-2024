package com.oussama.student_roster.services;

import com.oussama.student_roster.models.Dorm;
import com.oussama.student_roster.repositories.DormRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DormService {
    private final DormRepository dormRepo;

    public DormService(DormRepository dormRepo) {
        this.dormRepo = dormRepo;
    }

    public List<Dorm> allDorms(){
        return dormRepo.findAll();
    }

    public Dorm addDorm(Dorm dorm) {
        return dormRepo.save(dorm);
    }

    public Dorm findDorm(Long id) {
        Optional<Dorm> optionalDorm = dormRepo.findById(id);
        return optionalDorm.orElse(null);
    }
}