package cn.forever.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.forever.service.MyService;

@RestController
public class MyController {
	
	@Autowired
	private MyService myServcie;
	@RequestMapping("/getUsers")
	public String getUsers() {
		String user = myServcie.getUser();
		return user;
	}
}
