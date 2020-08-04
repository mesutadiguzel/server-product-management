package com.fdmgroup.spm.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fdmgroup.spm.models.User;
import com.fdmgroup.spm.repositories.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImp implements UserService {
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}
	
	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username).orElse(null);
	}
	
	@Override
	public List<User> findAllUsers(){
		return userRepository.findAll();
	}
	
	@Override
	public Long numberOfUsers() {
		return userRepository.count();
	}

}
