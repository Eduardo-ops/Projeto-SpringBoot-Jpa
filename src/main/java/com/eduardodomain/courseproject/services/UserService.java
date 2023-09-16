package com.eduardodomain.courseproject.services;

import java.util.List;
import java.util.Optional;

import com.eduardodomain.courseproject.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardodomain.courseproject.model.User;
import com.eduardodomain.courseproject.repositories.UserRepository;

/**
 * User service class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
@Service
public class UserService {

    /**
     * Atribute userRepository.
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * Method responsible for fetching all users.
     *
     * @return - Return all users.
     */
    public List<User> findAll() {
        return userRepository.findAll();
    }

    /**
     * Method responsible for fetching a specific user.
     *
     * @param id - Param id.
     * @return - Return a specific user.
     * @exception ResourceNotFoundException - Exception that can be thrown.
     */
    public User findById(Long id) {
        Optional<User> objUser = userRepository.findById(id);
        return objUser.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    /**
     * Method responsible for inserting a users.
     *
     * @return - Return inserting user.
     */
    public User insert(User user) {
        return userRepository.save(user);
    }

    /**
     * Method responsible for deleting a specific user.
     *
     * @param id - Param id.
     */
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
