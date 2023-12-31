package com.eduardodomain.courseproject.dto.user;

import java.io.Serializable;

public class UserFormDTO implements Serializable {

    /**
     * Atribute serialVersionUID of serializable
     */
    private static final long serialVersionUID = 1L;

    /**
     * Atribute name
     */
    private String name;

    /**
     * Atribute email
     */
    private String email;

    /**
     * Atribute phone
     */
    private String phone;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
