package com.example.mb_be.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mb_be.model.entity.User;



public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUsername(String username);
}
