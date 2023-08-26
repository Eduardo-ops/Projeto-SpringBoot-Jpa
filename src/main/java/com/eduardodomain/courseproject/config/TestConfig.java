/**
 *
 */
package com.eduardodomain.courseproject.config;

import com.eduardodomain.courseproject.model.Category;
import com.eduardodomain.courseproject.model.Order;
import com.eduardodomain.courseproject.model.User;
import com.eduardodomain.courseproject.repositories.CategoryRepository;
import com.eduardodomain.courseproject.repositories.OrderRepository;
import com.eduardodomain.courseproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

import static com.eduardodomain.courseproject.model.enums.OrderStatus.PAID;
import static com.eduardodomain.courseproject.model.enums.OrderStatus.WAITING_PAYMENT;

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

    /**
     * Atribute categoryRepository.
     */
    @Autowired
    private CategoryRepository categoryRepository;

    /**
     * Method to perform manual inserts in datebase h2.
     */
    @Override
    public void run(String... args) throws Exception {
        // User objects
        User user1 = new User(null, "Maria Brown", "maria@hotmail.com", "999565430", "123456");
        User user2 = new User(null, "Alex Green", "alex@hotmail.com", "999452817", "123345");
        userRepository.saveAll(Arrays.asList(user1, user2));

        // Order objects
        Order order1 = new Order(null, Instant.parse("2023-08-20t19:53:07Z"), PAID, user1);
        Order order2 = new Order(null, Instant.parse("2023-08-21t19:53:07Z"), WAITING_PAYMENT, user2);
        Order order3 = new Order(null, Instant.parse("2023-08-22t19:53:07Z"), WAITING_PAYMENT, user1);
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));

        // Category objects
        Category category1 = new Category(null, "Eletronics");
        Category category2 = new Category(null, "Books");
        Category category3 = new Category(null, "Computers");
        categoryRepository.saveAll(Arrays.asList(category1, category2, category3));
    }
}
