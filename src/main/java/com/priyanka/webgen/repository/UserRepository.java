package com.priyanka.webgen.repository;

import com.priyanka.webgen.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Find user by email (used for login/authentication)
    Optional<User> findByEmail(String email);

    // Check if user exists by email
    boolean existsByEmail(String email);
}
