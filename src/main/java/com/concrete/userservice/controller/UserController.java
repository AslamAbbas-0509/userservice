package com.concrete.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concrete.userservice.dto.UserDto;
import com.concrete.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	@Value("${custom.config.value}")
	String configValue;
	@Autowired
	UserService userService;
	
	@GetMapping("/{id}")
	public UserDto getUser(@PathVariable int id)
	{
		return userService.getUser(id);
	}
	
	@GetMapping
    public List<String> getUsers() {
        return List.of("Alice", "Bob", "Charlie",configValue);
    }

}
