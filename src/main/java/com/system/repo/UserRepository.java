package com.system.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.system.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	@Query("From User where identifier=?1 and password=?2")
	User findByUsernamePassword(String identifier, String password);
	
	@Query("From User where userType=?1 ")
	List<User> getUsersByType(String type);
	
}
