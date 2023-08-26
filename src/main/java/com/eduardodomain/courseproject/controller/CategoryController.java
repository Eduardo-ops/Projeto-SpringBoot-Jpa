package com.eduardodomain.courseproject.controller;

import com.eduardodomain.courseproject.model.Category;
import com.eduardodomain.courseproject.model.User;
import com.eduardodomain.courseproject.services.CategoryService;
import com.eduardodomain.courseproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Category controller class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    /**
     * Atribute categoryService.
     */
    @Autowired
    private CategoryService categoryService;

    /**
     * Method responsible for fetching all categories.
     *
     * @return - Return all categories.
     */
    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        return ResponseEntity.ok().body(categoryService.findAll());
    }

    /**
     * Method responsible for fetching a specific category.
     *
     * @param id - Param id.
     * @return - Return a specific category.
     */
    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(categoryService.findById(id));
    }
}
