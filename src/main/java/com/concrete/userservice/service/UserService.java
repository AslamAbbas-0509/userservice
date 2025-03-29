package com.concrete.userservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concrete.userservice.dto.UserDto;
import com.concrete.userservice.model.User;
import com.concrete.userservice.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ModelMapper modelMapper;
	public UserDto getUser(int id)
	{
		User user = userRepository.findById(id).get() ;
		UserDto userDto = modelMapper.map(user, UserDto.class );
		return userDto;
	}
	
	
	

}
