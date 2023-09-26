package com.eduardodomain.courseproject.controller;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import com.eduardodomain.courseproject.dto.user.UserDTO;
import com.eduardodomain.courseproject.dto.user.UserFormDTO;
import com.eduardodomain.courseproject.dto.user.UserUpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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
    public ResponseEntity<List<UserDTO>> findAll() {
        return ResponseEntity.ok().body(userService.findAll().stream().map(user -> new UserDTO(user)).collect(Collectors.toList()));
    }

    /**
     * Method responsible for fetching a specific user.
     *
     * @param id - Param id.
     * @return - Return a specific user.
     */
    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(new UserDTO(userService.findById(id)));
    }

    /**
     * Method responsible for inserting a users.
     *
     * @return - Return inserting user.
     */
    @PostMapping
    public ResponseEntity<UserDTO> insert(@RequestBody @Validated UserFormDTO userFormDTO) {
        User user = userService.convertToUser(userFormDTO);
        userService.insert(user);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(new UserDTO(user));
    }

    /**
     * Method responsible for update a specific user.
     *
     * @return - Return inserting user.
     */
    @PutMapping(value = "/{id}")
    public ResponseEntity<UserDTO> update(@PathVariable Long id,@RequestBody @Validated UserUpdateDTO userUpdateDTO) {
        User user = userService.update(id, userUpdateDTO);
        return ResponseEntity.ok().body(new UserDTO(user));
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