package com.example.mb_be.model.service;

import com.example.mb_be.model.entity.User;

public interface UserService {
	User createUser(User user);
	User updateUser(int id, User user);
	User getUserById(int id);
	boolean deleteUser(int id);
	User getByUsername(String username);
	User saveOrUpdate(User user);
	
}
