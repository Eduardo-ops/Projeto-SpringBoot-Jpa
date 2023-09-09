/**
 *
 */
package com.eduardodomain.courseproject.config;

import static com.eduardodomain.courseproject.model.enums.OrderStatus.PAID;
import static com.eduardodomain.courseproject.model.enums.OrderStatus.WAITING_PAYMENT;

import java.time.Instant;
import java.util.Arrays;

import com.eduardodomain.courseproject.model.*;
import com.eduardodomain.courseproject.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

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
     * Atribute productRepository.
     */
    @Autowired
    private ProductRepository productRepository;

    /**
     * Atribute orderItemRepository.
     */
    @Autowired
    private OrderItemRepository orderItemRepository;

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

        // Product objects
        Product product1 = new Product(null, "The Lord of Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product product2 = new Product(null, "Smart Tv Lg UHD 55", "Lorem ipsum dolor sit amet, consectetur.", 2899.99, "");
        Product product3 = new Product(null, "MacBoook A1", "Lorem ipsum dolor sit amet, consectetur.", 5999.99, "");
        Product product4 = new Product(null, "Pc Gamer", "Lorem ipsum dolor sit amet, consectetur.", 8.999, "");
        Product product5 = new Product(null, "Rails for Dummies", "Lorem ipsum dolor sit amet, consectetur.", 100.99, "");
        productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));

        // Association between objetcs.
        product1.getCategories().add(category2);
        product2.getCategories().add(category1);
        product2.getCategories().add(category3);
        product3.getCategories().add(category3);
        product4.getCategories().add(category3);
        product5.getCategories().add(category2);
        productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));

        // OrderItem objects
        OrderItem orderItem1 = new OrderItem(order1, product1, 2, product1.getPrice());
        OrderItem orderItem2 = new OrderItem(order1, product3, 1, product3.getPrice());
        OrderItem orderItem3 = new OrderItem(order2, product3, 2, product3.getPrice());
        OrderItem orderItem4 = new OrderItem(order3, product5, 2, product5.getPrice());
        orderItemRepository.saveAll(Arrays.asList(orderItem1, orderItem2, orderItem3, orderItem4));

        // Payment objects
        Payment payment1 = new Payment(null, Instant.parse("2023-08-21t21:00:07Z"), order1);
        order1.setPayment(payment1);
        orderRepository.save(order1);
    }
}
