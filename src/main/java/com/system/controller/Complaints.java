package com.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.system.model.Complaint;
import com.system.service.ComplaintService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("complaints")
public class Complaints {
	
	@Autowired
	ComplaintService complaintService;
	// Fetch single user
		@GetMapping("/{id}")
		public Complaint getComplaintsId(@PathVariable("id") int userId) {
			return complaintService.getComplaintId(userId);
		}
		//add complaints
		@PostMapping
		@ResponseStatus(HttpStatus.CREATED)
		public Complaint addComplaint(@RequestBody Complaint complaint) {
			return complaintService.addComplaint(complaint);
		}
		
		@GetMapping("")
		public List<Complaint> getAllComplaint() {
			return complaintService.getAllComplaint();
		}
		
		@GetMapping("user/{id}")
		public List<Complaint> getComplaintsByUserId(@PathVariable("id") int userId) {
			return complaintService.getComplaintsByUserId(userId);
		}
		
		

}
