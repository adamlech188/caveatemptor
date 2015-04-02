package com.hibernate.caveatemptor.domain;

import java.util.StringTokenizer;

public class User {

	private String firstname; 
	private String lastname; 
	
	public User() { 
		
	}
	public String getName() {
		return firstname + ' ' + lastname; 
	}
	
	public void setName(String name) {
		StringTokenizer t = new StringTokenizer(name); 
		firstname= t.nextToken(); 
		lastname = t.nextToken(); 
		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}
