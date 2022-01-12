package com.example.carApp.Services;


import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.carApp.models.*;
import com.example.carApp.Repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;

@Service
public class UserService{
	
	@Autowired
	private UserRepository userRepository;
	
//	@Override
//	public UserDetails loadUserByUsername(string a) throws UsernameNotFoundException{
//		return null;
//	}
//	
	//Get All Users
	public List<User> findAll(){
		return userRepository.findAll();
	}	
	
	//Get User By Id
	public Optional<User> findById(int id) {
		return userRepository.findById(id);
	}	
	
	//Delete User
	public void delete(int id) {
		userRepository.deleteById(id);
	}
	
	//Update User
	public void save(User user) {
		userRepository.save(user);
	}



}
