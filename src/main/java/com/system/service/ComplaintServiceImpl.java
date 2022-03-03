package com.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.model.Complaint;
import com.system.repo.ComplaintsRepository;

@Service
public class ComplaintServiceImpl implements ComplaintService{
	
	@Autowired
	private ComplaintsRepository repository;

	@Override
	public Complaint addComplaint(Complaint complaint) {
		// TODO Auto-generated method stub
		return repository.save(complaint);
	}

	@Override
	public Complaint getComplaintId(int complaintId) {
		return repository.findById(complaintId).get();
	}

	@Override
	public void updateComplaint(Complaint complaint) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteComplaintById(int complaintId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Complaint> getAllComplaint() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Complaint> getComplaintsByUserId(int userId) {
		// TODO Auto-generated method stub
		return repository.getComplaintsByUserId(userId);
	}
	
	@Override
	public List<Complaint> getComplaintsByPin(String pin) {
		// TODO Auto-generated method stub
		return repository.getComplaintsByPin(pin);
	}

	@Override
	public List<Complaint> getComplaintsByAssignedId(int userId) {
		// TODO Auto-generated method stub
		return repository.getComplaintsByAssignedId(userId);
	}
	
	

}
