package com.eduardodomain.courseproject.dto.user;

import com.eduardodomain.courseproject.model.User;

import java.io.Serializable;

/**
 * Class reponsible for standardizing the dto user entity.
 *
 * @author - Eduardo Isidoro Gonçalves.
 */
public class UserDTO implements Serializable {

    /**
     * Atribute serialVersionUID of serializable
     */
    private static final long serialVersionUID = 1L;

    /**
     * Atribute id
     */
    private Long id;

    /**
     * Atribute name
     */
    private String name;

    /**
     * Atribute email
     */
    private String email;

    /**
     * Default constructor
     */
    public UserDTO() {
    }

    /**
     * Constructor with all fields
     *
     * @param user - User parameter
     */
    public UserDTO(User user) {
        id = user.getId();
        name = user.getName();
        email = user.getEmail();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
