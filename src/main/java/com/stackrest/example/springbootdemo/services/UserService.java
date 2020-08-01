package com.stackrest.example.springbootdemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackrest.example.springbootdemo.entity.User;
import com.stackrest.example.springbootdemo.repository.UserRepo;

@Service
public class UserService {
//Autowire Repository
	
	@Autowired
	private UserRepo userRepository ;
	
	//getalluser method
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
	
	public User createUset(User user) {
		return userRepository.save(user);
	}
	
	public Optional<User> getUser(Long id) {
		return userRepository.findById(id);
	}
	
	public User updateUserById(Long id,User user) {
		user.setId(id);
		return userRepository.save(user);
	}
	
	public void deleteUserById(Long id) {
		if(getUser(id).isPresent())
		 userRepository.deleteById(id);
	}
	
	public User getUserByUserName(String userName) {
		return userRepository.findUserByUserName(userName);
	}
}
