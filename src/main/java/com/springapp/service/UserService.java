package com.springapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.controller.SessionController;
import com.springapp.model.User;
import com.springapp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SessionController sessionController;

	public Boolean verifyLogin(User requestedUser) {
		Optional<User> optional = Optional.of(userRepository.findByLogin(requestedUser.getLogin()));
		if (optional.isPresent()) {
			User user = optional.get();
			if (user.getLogin().equals(requestedUser.getLogin())
					&& user.getPassword().equals(requestedUser.getPassword())) {
				sessionController.setUser(user);
				return true;
			}
		}

		return false;
	}

}
