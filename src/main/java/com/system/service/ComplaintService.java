package com.system.service;

import java.util.List;

import com.system.model.Complaint;

public interface ComplaintService {

	Complaint addComplaint(Complaint complaint);
	List<Complaint> getComplaintsByUserId(int userId);
	  void updateComplaint(Complaint complaint);
	  void deleteComplaintById(int complaintId);
	  List<Complaint> getAllComplaint();
	Complaint getComplaintId(int complaintId);
	List<Complaint> getComplaintsByPin(String pin);
	List<Complaint> getComplaintsByAssignedId(int userId);
	
}
