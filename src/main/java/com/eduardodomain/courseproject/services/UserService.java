/**
 * 
 */
package com.eduardodomain.courseproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardodomain.courseproject.model.User;
import com.eduardodomain.courseproject.repositories.UserRepository;

/**
 * User service class.
 * 
 * @author Eduardo Isidoro Gonçalves.
 */
@Service
public class UserService {

	/**
	 * Atribute userRepository.
	 */
	@Autowired
	private UserRepository userRepository;

	/**
	 * Method responsible for fetching all users.
	 * 
	 * @return - Return all users.
	 */
	public List<User> findAll() {
		return userRepository.findAll();
	}

	/**
	 * Method responsible for fetching a specific user.
	 * 
	 * @param id - Param id.
	 * @return - Return a specific user.
	 */
	public User findById(Long id) {
		Optional<User> objUser = userRepository.findById(id);
		return objUser.get();
	}
}
