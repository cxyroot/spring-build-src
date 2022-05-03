package com.google.service.impl;

import com.google.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Override
	public void save() {
		System.out.println("UserServiceImpl.save");
	}
}
