package com.eduardodomain.courseproject.services.exceptions;

/**
 * Custom exception ResourceNotFoundException class.
 *
 * @author - Eduardo Isidoro Gonçalves.
 */
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor
     *
     * @param id - ResourceNotFoundException id parameter;
     */
    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id: " + id);
    }
}
