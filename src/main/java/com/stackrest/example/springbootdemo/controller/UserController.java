package com.stackrest.example.springbootdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackrest.example.springbootdemo.entity.User;
import com.stackrest.example.springbootdemo.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUser();
	}
	
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return userService.createUset(user);
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> getUser(@PathVariable Long id) {
	return userService.getUser(id);
	}
	
	@PutMapping("users/{id}")
	public User updateUser(@PathVariable Long id, @RequestBody User user) {
		return userService.updateUserById(id, user);
	}
	
	@DeleteMapping("users/{id}")
	public void deleteUserById(@PathVariable Long id) {
		userService.deleteUserById(id);
	}
	
	@GetMapping("users/find/{userName}")
	public User getUserByUserName(@PathVariable String userName) {
		return userService.getUserByUserName(userName);
	}
}
