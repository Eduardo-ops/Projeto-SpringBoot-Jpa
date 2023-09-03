package com.eduardodomain.courseproject.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Class reponsible for standardizing the User category.
 *
 * @author - Eduardo Isidoro Gonçalves.
 */
@Entity
@Table(name = "tb_category")
public class Category implements Serializable {

    /**
     * Atribute serialVersionUID of serializable.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Atribute id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Atribute name.
     */
    private String name;

    /**
     * Atribute product list.
     */
    @OneToMany(mappedBy = "product")
    private Set<Product> productList = new HashSet<>();

    /**
     * Default constructor.
     */
    public Category() {

    }

    /**
     * Constructor with all fields.
     *
     * @param id   - Category id parameter.
     * @param name - Category name parameter.
     */
    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Method responsible for comparing objects.
     *
     * @param o - Object of comparinson.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;

        Category category = (Category) o;

        return getId().equals(category.getId());
    }

    /**
     * Method responsible for comparing objects.
     */
    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    /**
     * Method get.
     *
     * @return the id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Method set.
     *
     * @param id the id to set.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Method get.
     *
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Method set.
     *
     * @param name the name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method get.
     *
     * @return the productList.
     */
    public Set<Product> getProductList() {
        return this.productList;
    }
}
