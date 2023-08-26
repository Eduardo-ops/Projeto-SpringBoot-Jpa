package com.eduardodomain.courseproject.repositories;

import com.eduardodomain.courseproject.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Order repository class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

}
