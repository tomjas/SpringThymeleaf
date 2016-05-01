package com.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springapp.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findAll();

	User findByName(String name);

	List<User> findById(Integer id);

	User findByEmail(String email);
	
	User findByLogin(String login);
}
