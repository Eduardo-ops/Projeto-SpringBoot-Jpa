package com.eduardodomain.courseproject.controller;

import com.eduardodomain.courseproject.model.Order;
import com.eduardodomain.courseproject.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Order controller class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    /**
     * Atribute userService.
     */
    @Autowired
    private OrderService orderService;

    /**
     * Method responsible for fetching all orders.
     *
     * @return - Return all orders.
     */
    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        return ResponseEntity.ok().body(orderService.findAll());
    }

    /**
     * Method responsible for fetching a specific order.
     *
     * @param id - Param id.
     * @return - Return a specific order.
     */
    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(orderService.findById(id));
    }
}
