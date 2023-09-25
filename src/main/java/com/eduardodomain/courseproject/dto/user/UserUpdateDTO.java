package com.eduardodomain.courseproject.dto.user;

import java.io.Serializable;

/**
 * Class reponsible for standardizing the UserUpdateDTO entity.
 *
 * @author - Eduardo Isidoro Gonçalves.
 */
public class UserUpdateDTO implements Serializable {

    /**
     * Atribute serialVersionUID of serializable
     */
    private static final long serialVersionUID = 1L;

    /**
     * Atribute name
     */
    private String name;

    /**
     * Atribute phone
     */
    private String phone;

    /**
     * Atribute password
     */
    private String password;

    /**
     * Method get
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Method set
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method get
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Method set
     *
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Method get
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Method set
     *
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
