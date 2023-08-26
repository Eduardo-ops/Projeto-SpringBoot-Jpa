package com.eduardodomain.courseproject.services;

import com.eduardodomain.courseproject.model.Order;
import com.eduardodomain.courseproject.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Order service class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@Service
public class OrderService {

    /**
     * Atribute orderRepository.
     */
    @Autowired
    private OrderRepository orderRepository;

    /**
     * Method responsible for fetching all orders.
     *
     * @return - Return all orders.
     */
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    /**
     * Method responsible for fetching a specific order.
     *
     * @param id - Param id.
     * @return - Return a specific order.
     */
    public Order findById(Long id) {
        Optional<Order> objOrder = orderRepository.findById(id);
        return objOrder.get();
    }
}
