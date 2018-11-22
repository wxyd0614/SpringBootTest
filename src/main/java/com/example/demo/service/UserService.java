package com.example.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.serviceimp.UserServiceimp;
@Service
public class UserService implements UserServiceimp{
@Autowired 
private UserDao userDao;
	@Override
	public Map<String, Object> getUser(Integer userId) {
		// TODO Auto-generated method stub
		return userDao.getUser(userId);
	}

}
