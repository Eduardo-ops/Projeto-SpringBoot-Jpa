package com.eduardodomain.courseproject.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Class reponsible for standardizing the Product entity.
 *
 * @author - Eduardo Isidoro Gonçalves.
 */
@Entity
@Table(name = "tb_product")
public class Product implements Serializable {

    /**
     * Atribute serialVersionUID of serializable
     */
    private static final long serialVersionUID = 1L;

    /**
     * Atribute id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Atribute name
     */
    private String name;

    /**
     * Atribute description
     */
    private String description;

    /**
     * Atribute price
     */
    private Double price;

    /**
     * Atribute imgUrl
     */
    private String imgUrl;

    /**
     * Atribute categories
     */
    @ManyToMany
    @JoinTable(name = "tb_product_category",
    joinColumns = @JoinColumn(name = "product_id"),
    inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories = new HashSet<>();

    /**
     * Default constructor
     */
    public Product() {
    }

    /**
     * Constructor with all fields
     *
     * @param id          - Product id parameter
     * @param name        - Product name parameter
     * @param description - Product description parameter
     * @param price       - ProductProduct price parameter
     * @param imgUrl      - Product imgUrl parameter
     */
    public Product(Long id, String name, String description, Double price, String imgUrl) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    /**
     * Method get
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Method set
     *
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Method get
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Method set
     *
     * @param name the id to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method get
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Method set
     *
     * @param description the id to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Method get
     *
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Method set
     *
     * @param price the id to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Method get
     *
     * @return the imgUrl
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * Method set
     *
     * @param imgUrl the id to set
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * Method set
     *
     * @param categories the id to set
     */
    public Set<Category> getCategories() {
        return categories;
    }

    /**
     * Method responsible for comparing objects
     *
     * @param obj - Object of comparinson
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;

        Product product = (Product) obj;

        return getId().equals(product.getId());
    }

    /**
     * Method responsible for comparing objects
     */
    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
