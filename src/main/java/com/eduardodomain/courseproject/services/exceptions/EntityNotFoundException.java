package com.eduardodomain.courseproject.services.exceptions;

/**
 * Custom exception EntityNotFoundException class.
 *
 * @author - Eduardo Isidoro Gonçalves.
 */
public class EntityNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor
     *
     * @param message - EntityNotFoundException message parameter;
     */
    public EntityNotFoundException(String message) {
        super(message);
    }
}
