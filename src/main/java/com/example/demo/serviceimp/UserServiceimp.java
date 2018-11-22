package com.example.demo.serviceimp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

public interface UserServiceimp {
	Map<String, Object> getUser(Integer userId);
}
