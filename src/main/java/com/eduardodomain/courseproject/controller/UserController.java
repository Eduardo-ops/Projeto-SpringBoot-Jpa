package com.eduardodomain.courseproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardodomain.courseproject.model.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@GetMapping
	public ResponseEntity<User> findAll() {
		return ResponseEntity.ok().body(new User(1L, "Maria", "maria.goncalves@hotmail.com", "12345678", "12345"));
	}

}
