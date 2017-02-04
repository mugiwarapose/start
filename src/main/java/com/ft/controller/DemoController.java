package com.ft.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ft.entity.User;
import com.ft.pojo.Demo;
import com.ft.service.UserService;

import com.alibaba.fastjson.JSONObject;


@RestController
public class DemoController {

	
	@Resource
	public UserService userService;
	
	@RequestMapping("/demo")
	public Demo getDemo() {
	
		
		Demo demo = new Demo();
		
		demo.setId(1);

		demo.setName("vvspring-boot:run");

		return demo;
	}
	/*@RequestMapping("/user")
	public String getAllUser(){
		User u = userService.getAllUser();
		return JSONObject.toJSONString(u);
	}*/
}
