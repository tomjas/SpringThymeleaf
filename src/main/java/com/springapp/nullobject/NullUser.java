package com.springapp.nullobject;

import com.springapp.model.Role;
import com.springapp.model.User;

@SuppressWarnings("serial")
public class NullUser extends User {

	private final String EMPTY_STRING = "";
	private final Integer FAKE_ID = 0;

	@Override
	public void setRole(Role role) {
		super.setRole(Role.USER);
	}

	@Override
	public void setId(Integer id) {
		super.setId(FAKE_ID);
	}

	@Override
	public void setLogin(String login) {
		super.setLogin(EMPTY_STRING);
	}

	@Override
	public void setName(String name) {
		super.setName(EMPTY_STRING);
	}

	@Override
	public void setEmail(String email) {
		super.setEmail(EMPTY_STRING);
	}
	
	@Override
	public void setLastName(String lastName) {
		super.setLastName(EMPTY_STRING);
	}
	
	@Override
	public void setPassword(String password) {
		super.setPassword(EMPTY_STRING);
	}
}
