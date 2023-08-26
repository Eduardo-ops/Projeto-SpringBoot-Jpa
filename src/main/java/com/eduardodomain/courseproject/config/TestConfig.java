/**
 *
 */
package com.eduardodomain.courseproject.config;

import java.time.Instant;
import java.util.Arrays;

import com.eduardodomain.courseproject.model.Order;
import com.eduardodomain.courseproject.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eduardodomain.courseproject.model.User;
import com.eduardodomain.courseproject.repositories.UserRepository;

/**
 * Configuration Class for the test profile.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    /**
     * Atribute userRepository.
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * Atribute orderRepository.
     */
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria Brown", "maria@hotmail.com", "999565430", "123456");
        User user2 = new User(null, "Alex Green", "alex@hotmail.com", "999452817", "123345");
        userRepository.saveAll(Arrays.asList(user1, user2));

        Order order1 = new Order(null, Instant.parse("2023-08-20t19:53:07Z"), user1);
        Order order2 = new Order(null, Instant.parse("2023-08-21t19:53:07Z"), user2);
        Order order3 = new Order(null, Instant.parse("2023-08-22t19:53:07Z"), user1);
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));
    }
}
