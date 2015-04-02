package com.hibernate.caveatemptor.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.DiscriminatorFormula;

@Entity
@Table(name = "ITEM")
@BatchSize(size=10)
@DiscriminatorFormula( "case when ITEM_IS_SPECIAL is not null then A else B end")
public class Item {

	
	@Id
	@GeneratedValue
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
