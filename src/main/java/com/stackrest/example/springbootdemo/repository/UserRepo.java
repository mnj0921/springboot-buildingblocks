package com.stackrest.example.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackrest.example.springbootdemo.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{

	User findUserByUserName(String userName);
}