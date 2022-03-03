package com.system.service;

import java.util.List;

import com.system.model.User;


public interface UserService {
	
  User addUser(User user);
  User getUserById(int userId);
  void updateUser(User user);
  void deleteUserById(int userId);
  List<User> getAllUsers();
  User loginValidation (User user);
  List<User> getUsersByType(String type);
}