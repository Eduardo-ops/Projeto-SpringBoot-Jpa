package com.eduardodomain.courseproject.repositories;

import com.eduardodomain.courseproject.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * OrderItem repository class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
