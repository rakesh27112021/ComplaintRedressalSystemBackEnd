package com.system.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.system.model.Complaint;

public interface ComplaintsRepository extends JpaRepository<Complaint, Integer>{
	@Query("From Complaint where raisedBy.userId=?1 ")
	List<Complaint> getComplaintsByUserId(Integer userId);
	
	@Query("From Complaint where pin=?1 ")
	List<Complaint> getComplaintsByPin(String pin);
	
	@Query("From Complaint where assignedTo.userId=?1 ")
	List<Complaint> getComplaintsByAssignedId(Integer userId);
	

}
