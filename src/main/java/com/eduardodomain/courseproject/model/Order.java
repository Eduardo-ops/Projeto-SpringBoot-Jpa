package com.eduardodomain.courseproject.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.eduardodomain.courseproject.model.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import static com.eduardodomain.courseproject.model.enums.OrderStatus.valueOf;

/**
 * Class responsible for standardizing the order entity.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;

    /**
     * Atribute orderStatus.
     */
    private Integer orderStatus;

    /**
     * Atribute client.
     */
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    /**
     * Default constructor
     */
    public Order() {

    }

    /**
     * Constructor with all fields.
     *
     * @param id          - Order id parameter.
     * @param moment      - Order moment id parameter.
     * @param orderStatus - Order status.
     * @param client      - Order client parameter.
     */
    public Order(Long id, Instant moment, OrderStatus orderStatus, User client) {
        super();
        this.id = id;
        this.moment = moment;
        this.setOrderStatus(orderStatus);
        this.client = client;
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, id, moment);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        return Objects.equals(client, other.client) && Objects.equals(id, other.id)
                && Objects.equals(moment, other.moment);
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the moment
     */
    public Instant getMoment() {
        return moment;
    }

    /**
     * @param moment the moment to set
     */
    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    /**
     * @return the orderStatus
     */
    public OrderStatus getOrderStatus() {
        return valueOf(orderStatus);
    }

    /**
     * @param orderStatus the orderStatus to set
     */
    public void setOrderStatus(OrderStatus orderStatus) {
        if (orderStatus != null) {
            this.orderStatus = orderStatus.getStatusCode();
        }
    }

    /**
     * @return the client
     */
    public User getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(User client) {
        this.client = client;
    }

}
