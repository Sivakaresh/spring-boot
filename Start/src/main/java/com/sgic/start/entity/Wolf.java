package com.sgic.start.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wolf {

	@Id
	Integer id;
	String colour;
	String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
