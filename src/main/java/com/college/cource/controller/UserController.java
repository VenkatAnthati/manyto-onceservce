package com.college.cource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.cource.controller.service.UserService;
import com.college.cource.model.Phone;
import com.college.cource.model.User;
import com.college.cource.repositoy.UserRepositoy;

@RestController
public class UserController {
	
    
    @Autowired
    UserService service;
    
    
	@PostMapping("/user/save")
	public void saveUser(@RequestBody User user) {
		
	 service.saveUser(user);	
	}
	
	@GetMapping("/user/findAll")
	public List<User> findAll(  ) {
		
	 return service.findAll();	
	}
	
	@PostMapping("/phone/save")
	public void savePhone(@RequestBody Phone phone) {
		
	 service.savephone(phone);	
	}
}
