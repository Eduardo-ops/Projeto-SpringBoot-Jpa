package com.eduardodomain.courseproject.model.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHEPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int statusCode;

    private OrderStatus(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public static OrderStatus valueOf(int statusCode) {
        for (OrderStatus valueStatus : OrderStatus.values()) {
            if (valueStatus.getStatusCode() == statusCode) {
                return valueStatus;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
