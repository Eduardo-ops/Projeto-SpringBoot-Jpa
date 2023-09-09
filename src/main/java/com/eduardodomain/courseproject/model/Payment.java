package com.eduardodomain.courseproject.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * Class reponsible for standardizing the Payment entity.
 *
 * @author - Eduardo Isidoro Gonçalves.
 */
@Entity
@Table(name = "tb_payment")
public class Payment implements Serializable {

    /**
     * Atribute serialVersionUID of serializable.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Atribute id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Atribute moment.
     */
    private Instant moment;

    /**
     * Atribute order.
     */
    @OneToOne()
    @MapsId
    private Order order;

    /**
     * Default constructor.
     */
    public Payment() {
    }

    /**
     * Constructor with all fields.
     *
     * @param id     - Payment id parameter.
     * @param moment - Payment name parameter.
     * @param order  - Payment order parameter.
     */
    public Payment(Long id, Instant moment, Order order) {
        super();
        this.id = id;
        this.moment = moment;
        this.order = order;
    }

    /**
     * Method get.
     *
     * @return the id.
     */
    public Long getId() {
        return id;
    }

    /**
     * Method set.
     *
     * @param id the id to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Method get.
     *
     * @return the moment.
     */
    public Instant getMoment() {
        return moment;
    }

    /**
     * Method set.
     *
     * @param moment the moment to set.
     */
    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    /**
     * Method get.
     *
     * @return the order.
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Method set.
     *
     * @param order the order to set.
     */
    public void setOrder(Order order) {
        this.order = order;
    }

    /**
     * Method responsible for comparing objects
     *
     * @param obj - Object of comparinson
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Payment)) return false;

        Payment payment = (Payment) obj;

        return getId().equals(payment.getId());
    }

    /**
     * Method responsible for comparing objects
     */
    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
