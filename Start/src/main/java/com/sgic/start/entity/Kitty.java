package com.sgic.start.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Kitty {

	@Id
	Integer id;
	String name;
	String fav;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFav() {
		return fav;
	}
	public void setFav(String fav) {
		this.fav = fav;
	}
	
}
