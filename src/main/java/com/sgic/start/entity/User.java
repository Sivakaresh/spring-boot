package com.sgic.start.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	private Integer id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	
	
	@ManyToOne(cascade= {CascadeType.PERSIST}) //refer casecade type,persist- depends parent class
	private Role role;
	
	@OneToMany(mappedBy="user",fetch=FetchType.EAGER,cascade= {CascadeType.ALL})//must-eager, occationally when trigger-lazy
	private List<Leave> leave;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
