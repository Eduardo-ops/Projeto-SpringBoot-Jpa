package com.eduardodomain.courseproject.controller;

import java.net.URI;
import java.util.List;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.eduardodomain.courseproject.model.User;
import com.eduardodomain.courseproject.services.UserService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 * User controller class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

    /**
     * Atribute userService.
     */
    @Autowired
    private UserService userService;

    /**
     * Method responsible for fetching all users.
     *
     * @return - Return all users.
     */
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(userService.findAll());
    }

    /**
     * Method responsible for fetching a specific user.
     *
     * @param id - Param id.
     * @return - Return a specific user.
     */
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    /**
     * Method responsible for inserting a users.
     *
     * @return - Return inserting user.
     */
    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User user) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(user);
    }

    /**
     * Method responsible for deleting a specific user.
     *
     * @param id - Param id.
     */
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
