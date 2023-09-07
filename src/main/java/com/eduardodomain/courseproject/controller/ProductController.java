package com.eduardodomain.courseproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardodomain.courseproject.model.Product;
import com.eduardodomain.courseproject.services.ProductService;

/**
 * Product controller class.
 * 
 * @author Eduardo Isidoro Gonçalves.
 */
@RestController
@RequestMapping(value = "/products")
public class ProductController {

	/**
	 * Atribute productService.
	 */
	@Autowired
	private ProductService productService;

	/**
	 * Method responsible for fetching all products.
	 * 
	 * @return - Return all products.
	 */
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		return ResponseEntity.ok().body(productService.findAll());
	}

	/**
	 * Method responsible for fetching a specific product.
	 * 
	 * @param id - Param id.
	 * @return - Return a specific product.
	 */
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(productService.findById(id));
	}
}
