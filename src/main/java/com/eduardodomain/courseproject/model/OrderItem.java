package com.eduardodomain.courseproject.model;

import com.eduardodomain.courseproject.pk.OrderItemPk;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

/**
 * Class reponsible for standardizing the OrderItem entity.
 *
 * @author - Eduardo Isidoro Gonçalves.
 */
@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

    /**
     * Atribute serialVersionUID of serializable.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Atribute id.
     */
    @EmbeddedId
    private OrderItemPk id;

    /**
     * Atribute quantity.
     */
    private Integer quantity;

    /**
     * Atribute price.
     */
    private Double price;

    /**
     * Default constructor.
     */
    public OrderItem() {

    }

    /**
     * Constructor with all fields.
     *
     * @param order    - OrderItem id parameter.
     * @param product  - OrderItem name parameter.
     * @param quantity - OrderItem description parameter.
     * @param price    - OrderItem price parameter.
     */
    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        super();
        this.id.setOrder(order);
        this.id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * Method get.
     *
     * @return the id order.
     */
    public Order getOrder() {
        return id.getOrder();
    }

    /**
     * Method set.
     *
     * @param order the id order to set.
     */
    public void setOrder(Order order) {
        id.setOrder(order);
    }

    /**
     * Method get.
     *
     * @return the id product.
     */
    public Product getProduct() {
        return id.getProduct();
    }

    /**
     * Method set.
     *
     * @param product the id product to set.
     */
    public void setProduct(Product product) {
        this.id.setProduct(product);
    }

    /**
     * Method responsible for the calculating order subtotal.
     */
    public Double subTotal() {
        return null;
    }

    /**
     * Method get
     *
     * @return the id quantity.
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Method set.
     *
     * @param quantity the quantity to set.
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Method get.
     *
     * @return the id price.
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Method set.
     *
     * @param price the price to set.
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Method responsible for comparing objects
     *
     * @param obj - Object of comparinson
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof OrderItem)) return false;

        OrderItem orderItem = (OrderItem) obj;

        return id.equals(orderItem.id);
    }

    /**
     * Method responsible for comparing objects
     */
    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
