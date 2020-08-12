package com.Reu.Converter;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.Reu.DTO.UserDTO;
import com.Reu.Model.User;

public class UserConverter {
	//TO Entity
	
	public User toEntity(UserDTO userDTO) {
		User user = new User();
		if(userDTO != null) {
			user.setId(userDTO.getId());
			user.setUsername(userDTO.getUsername());
			user.setPassword(userDTO.getPassword());
		}
		return user;
	}
	
	public UserDTO toDTO(User user) {
		UserDTO userDTO = new UserDTO();
		if(user != null) {
			userDTO.setId(user.getId());
			userDTO.setUsername(user.getUsername());
			userDTO.setPassword(user.getPassword());
		}
		return userDTO;
	}
	
}
