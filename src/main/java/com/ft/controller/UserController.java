package com.ft.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.ft.entity.User;
import com.ft.service.UserService;
@Controller
public class UserController {

	@Resource
	public UserService userService;
	
	
	@RequestMapping("/user")
	public String getAllUser(Model model){
		User u = userService.getAllUser();
		String s = JSONObject.toJSONString(u);
		model.addAttribute("user",s );
		
		return "index";
	}
}
