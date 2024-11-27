package com.example.minougram.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.minougram.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
