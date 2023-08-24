/**
 * 
 */
package com.eduardodomain.courseproject.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eduardodomain.courseproject.model.User;
import com.eduardodomain.courseproject.repositories.UserRepository;

/**
 * Configuration Class for the profile test.
 * 
 * @author Eduardo Isidoro Gonçalves.
 */
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User user1 = new User(null, "Maria Brown", "maria@hotmail.com", "999565430", "123456");
		User user2 = new User(null, "Alex Green", "alex@hotmail.com", "999452817", "123345");

		userRepository.saveAll(Arrays.asList(user1, user2));
	}
}
