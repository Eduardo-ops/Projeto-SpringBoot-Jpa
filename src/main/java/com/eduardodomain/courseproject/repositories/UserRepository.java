package com.eduardodomain.courseproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardodomain.courseproject.model.User;

/**
 * Class repository
 * 
 * @author Eduardo Isidoro Gonçalves
 */
public interface UserRepository extends JpaRepository<User, Long> {
	
}
