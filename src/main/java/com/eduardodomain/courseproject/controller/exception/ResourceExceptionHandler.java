package com.eduardodomain.courseproject.controller.exception;

import com.eduardodomain.courseproject.services.exceptions.DataBaseException;
import com.eduardodomain.courseproject.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

import static java.time.Instant.now;
import static org.springframework.http.HttpStatus.*;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler()
    public ResponseEntity<StandardError> resourceNotFoundHandler(ResourceNotFoundException e, HttpServletRequest request) {
        String error = "Resource not found";
        HttpStatus status = NOT_FOUND;
        StandardError standardError = new StandardError(now(), status.value(), error, e.getMessage(), request.getRequestURI());

        return ResponseEntity.status(status).body(standardError);
    }

    @ExceptionHandler
    public ResponseEntity<StandardError> dataBaseHandler(DataBaseException e, HttpServletRequest request) {
        String error = "Database error, integrity violation";
        HttpStatus status = BAD_REQUEST;
        StandardError standardError = new StandardError(now(), status.value(), error, e.getMessage(), request.getRequestURI());

        return ResponseEntity.status(status).body(standardError);
    }
}
