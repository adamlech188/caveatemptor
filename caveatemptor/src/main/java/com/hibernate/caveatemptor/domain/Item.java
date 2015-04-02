package com.hibernate.caveatemptor.domain;

import java.util.HashSet;
import java.util.Set;

public class Item {

	private String name; 
	private String description; 
	
	private Set<Category> categoriers = new HashSet<Category>(); 
	
	public Item() { 
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Category> getCategoriers() {
		return categoriers;
	}

	public void setCategoriers(Set<Category> categoriers) {
		this.categoriers = categoriers;
	}
	
   
}
