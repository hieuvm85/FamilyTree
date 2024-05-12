package com.example.mb_be.model.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mb_be.model.entity.User;
import com.example.mb_be.model.service.UserService;
import com.example.mb_be.repository.UserRepository;



@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User updateUser(int id, User user) {
		// TODO Auto-generated method stub
		user.setId(id);
		return userRepository.save(user);
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		return true;
	}

	@Override
	public User saveOrUpdate(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}
	
}
