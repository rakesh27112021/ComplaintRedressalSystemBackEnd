/*package com.system;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.model.User;
import com.system.service.UserService;


@RestController
@RequestMapping("user")
public class Admin1 {

	// Fetch all user records
		@GetMapping
		public String Test() {
			return "Testing rest Constroller";
		}
		
		// Fetch all user records
		@Autowired
		UserService userService;
		@GetMapping("/user")
		public List<User> getAllUsers() {
			return userService.getAllUsers();
		}
}*/