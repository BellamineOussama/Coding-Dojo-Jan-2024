package com.oussama.book_club.repositories;


import com.oussama.book_club.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    List<User> findAll();
    Optional<User> findByEmail(String email);
}