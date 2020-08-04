package com.fdmgroup.spm.services;

import java.util.List;

import com.fdmgroup.spm.models.User;

public interface UserService {

	User saveUser(User user);

	User updateUser(User user);

	void deleteUser(Long userId);

	User findByUsername(String username);

	List<User> findAllUsers();

	Long numberOfUsers();

}
