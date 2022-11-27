package com.ks.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ks.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
    Users findByUsernameAndPassword(String username, String password);
}
