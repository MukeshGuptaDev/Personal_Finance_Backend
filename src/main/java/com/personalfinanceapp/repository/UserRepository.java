package com.personalfinanceapp.repository;


import com.personalfinanceapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}