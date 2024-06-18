package com.education.portal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.portal.model.Signup;

@Repository
public interface SignupRepository extends JpaRepository<Signup, Long> {
    Optional<Signup> findByUsername(String username);
    Optional<Signup> findByEmail(String email);
}
