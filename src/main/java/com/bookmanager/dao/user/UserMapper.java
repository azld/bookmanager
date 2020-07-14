package com.bookmanager.dao.user;

import java.util.List;

import com.bookmanager.model.User;


public interface UserMapper {
	int deleteById(long userId);
	int insertUser(User auser);
	List<User> getAll();
	User selectById(long userId);
}
