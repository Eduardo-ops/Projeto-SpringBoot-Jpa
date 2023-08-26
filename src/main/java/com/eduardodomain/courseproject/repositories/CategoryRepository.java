package com.eduardodomain.courseproject.repositories;

import com.eduardodomain.courseproject.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Category repository class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
