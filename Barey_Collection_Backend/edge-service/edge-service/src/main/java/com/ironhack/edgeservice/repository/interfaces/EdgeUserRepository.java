package com.ironhack.edgeservice.repository.interfaces;


import com.ironhack.edgeservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface EdgeUserRepository extends JpaRepository<User, Long> {


    Optional<User> findByUsername(String username);
}
