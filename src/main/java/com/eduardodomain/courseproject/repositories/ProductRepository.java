/**
 * 
 */
package com.eduardodomain.courseproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardodomain.courseproject.model.Product;

/**
 * Product repository class.
 * 
 * @author Eduardo Isidoro Gonçalves.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
