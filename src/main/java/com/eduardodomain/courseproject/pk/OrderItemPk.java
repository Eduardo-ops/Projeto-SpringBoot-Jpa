package com.eduardodomain.courseproject.pk;

import com.eduardodomain.courseproject.model.Order;
import com.eduardodomain.courseproject.model.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

/**
 * Class reponsible for standardizing the OrderItemPk entity.
 *
 * @author - Eduardo Isidoro Gonçalves.
 */
@Embeddable
public class OrderItemPk implements Serializable {

    /**
     * Atribute serialVersionUID of serializable.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Atribute order.
     */
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    /**
     * Atribute product.
     */
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    /**
     * @return the order.
     */
    public Order getOrder() {
        return order;
    }

    /**
     * @param order the order to set.
     */
    public void setOrder(Order order) {
        this.order = order;
    }

    /**
     * @return the product.
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set.
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Method responsible for comparing objects
     *
     * @param obj - Object of comparinson
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof OrderItemPk)) return false;

        OrderItemPk that = (OrderItemPk) obj;

        if (!getOrder().equals(that.getOrder())) return false;
        return getProduct().equals(that.getProduct());
    }

    /**
     * Method responsible for comparing objects
     */
    @Override
    public int hashCode() {
        int result = getOrder().hashCode();
        result = 31 * result + getProduct().hashCode();
        return result;
    }
}
