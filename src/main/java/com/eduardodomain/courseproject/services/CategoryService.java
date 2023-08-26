package com.eduardodomain.courseproject.services;

import com.eduardodomain.courseproject.model.Category;
import com.eduardodomain.courseproject.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Category service class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@Service
public class CategoryService {

    /**
     * Atribute categoryRepository.
     */
    @Autowired
    private CategoryRepository categoryRepository;

    /**
     * Method responsible for fetching all categories.
     *
     * @return - Return all categories.
     */
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    /**
     * Method responsible for fetching a specific category.
     *
     * @param id - Param id.
     * @return - Return a specific category.
     */
    public Category findById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }
}
