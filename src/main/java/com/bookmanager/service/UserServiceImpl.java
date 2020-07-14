package com.bookmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmanager.dao.user.UserMapper;
import com.bookmanager.model.User;

@Service("UserService")
public class UserServiceImpl implements UserService {

	private UserMapper userMapper;
	
	public UserMapper getuserMapper() {
//		System.out.println("mapper getting -----------");
		return userMapper;
	}

	@Autowired
	public void setMuserMapper(UserMapper muserMapper) {
//		System.out.println("mapper setting -----------");
		this.userMapper = muserMapper;
	}
	
	public User getUser(long userId) {
		// TODO Auto-generated method stub
		User auser = userMapper.selectById(userId);
		return auser;
	}

	public void delete(long userId) {
		// TODO Auto-generated method stub
		userMapper.deleteById(userId);
	}

	public User insert(User auser) {
		// TODO Auto-generated method stub
		this.userMapper.insertUser(auser);
		return auser;
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
//		System.out.println("getAllUser -----------");
		List<User> list = this.userMapper.getAll();
		return list;
	}

}
