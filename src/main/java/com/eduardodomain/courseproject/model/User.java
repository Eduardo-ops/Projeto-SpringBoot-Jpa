package com.eduardodomain.courseproject.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class reponsible for standardizing the User entity
 * 
 * @author - Eduardo Isidoro Gonçalves
 */
public class User implements Serializable {

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
	 * Atribute phone
	 */
	private String phone;

	/**
	 * Atribute password
	 */
	private String password;

	/**
	 * Default constructor
	 */
	public User() {

	}

	/**
	 * Constructor with all fields
	 * 
	 * @param id       - User id parameter
	 * @param name     - User name parameter
	 * @param email    - User email parameter
	 * @param phone    - User phone parameter
	 * @param password - User password parameter
	 */
	public User(Long id, String name, String email, String phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	/**
	 * Method responsible for comparing objects
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	/**
	 * Method responsible for comparing objects
	 * 
	 * @param obj - Object of comparinson
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

	/**
	 * Method get
	 * 
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Method set
	 * 
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Method set
	 * 
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
