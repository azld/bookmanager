package com.bookmanager.service;

import java.util.List;

import com.bookmanager.model.User;

public interface UserService {

	User getUser(long userId);
	void delete(long userId);
	User insert(User auser);
	List<User> getAllUser();
}
