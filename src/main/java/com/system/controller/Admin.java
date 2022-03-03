package com.system.controller;


import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.system.model.Complaint;
import com.system.model.User;
import com.system.service.ComplaintService;
import com.system.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("user")
public class Admin {
	@Autowired
	UserService userService;
	
	@Autowired
	ComplaintService complaintService;

	// Insert user record
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	// Fetch all user records
	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	// Fetch single user
	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") int userId) {
		return userService.getUserById(userId);
	}

   //Update user record
	@PutMapping
	public ResponseEntity<String> updateUser(@RequestBody User user) {
		try {
			userService.updateUser(user);
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch (NoSuchElementException ex) {
			// log the error message
			System.out.println(ex.getMessage());
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}

	// Delete user record
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable int id) {
		try {
			userService.deleteUserById(id);
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch (RuntimeException ex) {
			// log the error message
			System.out.println(ex.getMessage());
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}
	
	// login user
	    @CrossOrigin(origins = "http://localhost:4200")
		@GetMapping("/login/{id}")
		public User getUserByUsernamePassword(@RequestBody User user) {
			return userService.loginValidation(user);
		}
	    
	    @PostMapping("/login/{id}")
		public User getUserByUsernamePassword1(@RequestBody User user) {
			return userService.loginValidation(user);
		}
	    
	    @GetMapping("/type/{type}")
		public List<User> getUsersByType(@PathVariable("type") String type) {
			return userService.getUsersByType(type);
		}
	    
	    
	    //======================Complaints
	    
	    @GetMapping("/complaints/user/{id}")
		public List<Complaint> getComplaintsByUserId(@PathVariable("id") int userId) {
			return complaintService.getComplaintsByUserId(userId);
		}
	    
	    @GetMapping("complaints/{id}")
		public Complaint getComplaintsId(@PathVariable("id") int userId) {
			return complaintService.getComplaintId(userId);
		}
	    	//add complaints
	  		@PostMapping("/complaints")
	  		@ResponseStatus(HttpStatus.CREATED)
	  		public Complaint addComplaint(@RequestBody Complaint complaint) {
	  			System.out.println(complaint);
	  			return complaintService.addComplaint(complaint);
	  		}
	  		
	  		@GetMapping("/complaints")
			public List<Complaint> getAllComplaint() {
				return complaintService.getAllComplaint();
			}
	  		
	  		@GetMapping("/complaints/manager/{pin}")
			public List<Complaint> getComplaintsByPin(@PathVariable("pin") String pin) {
				return complaintService.getComplaintsByPin(pin);
			}
	  		
	  		@GetMapping("/complaints/user/eng/{id}")
			public List<Complaint> getComplaintsByAssignedId(@PathVariable("id") int userId) {
				return complaintService.getComplaintsByAssignedId(userId);
			}
	  		
	  		
	  		
	  		
	    
}