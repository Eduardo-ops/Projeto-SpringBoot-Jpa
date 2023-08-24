package com.eduardodomain.courseproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardodomain.courseproject.model.User;
import com.eduardodomain.courseproject.services.UserService;

/**
 * User controller class.
 * 
 * @author Eduardo Isidoro Gonçalves.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

	/**
	 * Atribute userService.
	 */
	@Autowired
	private UserService userService;

	/**
	 * Method responsible for fetching all users.
	 * 
	 * @return - Return all users.
	 */
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok().body(userService.findAll());
	}

	/**
	 * Method responsible for fetching a specific user.
	 * 
	 * @param id - Param id.
	 * @return - Return a specific user.
	 */
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(userService.findById(id));
	}
}
