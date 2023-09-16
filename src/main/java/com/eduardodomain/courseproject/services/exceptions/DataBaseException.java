package com.eduardodomain.courseproject.services.exceptions;

public class DataBaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor
     *
     * @param message - DataBaseException id parameter;
     */
    public DataBaseException(String message) {
        super(message);
    }
}
