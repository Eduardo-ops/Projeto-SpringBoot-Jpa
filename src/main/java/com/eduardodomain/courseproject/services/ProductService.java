/**
 * 
 */
package com.eduardodomain.courseproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardodomain.courseproject.model.Product;
import com.eduardodomain.courseproject.repositories.ProductRepository;

/**
 * Product service class.
 * 
 * @author Eduardo Isidoro Gonçalves.
 */
@Service
public class ProductService {

	/**
	 * Atribute productRepository.
	 */
	@Autowired
	private ProductRepository productRepository;

	/**
	 * Method responsible for fetching all products.
	 * 
	 * @return - Return all products.
	 */
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	/**
	 * Method responsible for fetching a specific product.
	 * 
	 * @param id - Param id.
	 * @return - Return a specific product.
	 */
	public Product findById(Long id) {
		Optional<Product> objProduct = productRepository.findById(id);
		return objProduct.get();
	}
}
