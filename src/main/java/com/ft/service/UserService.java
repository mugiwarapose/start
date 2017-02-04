package com.ft.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ft.dao.DemoRepository;
import com.ft.entity.User;

@Service
public class UserService {
	
	@Resource
	private DemoRepository demoRepository;
	
	public User getAllUser(){
		
		User u  = demoRepository.findOne(1);
		return  u;
	}

}
