package com.luv2code.entity;

import javax.management.ConstructorParameters;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class student {
	
	@Id
	@Column(name="id")
	private int id;
	
	
	@Column(name="firstname")
	private String firstname;
	
	
	@Column(name="lasname")
	private  String lasname;
	
	
	@Column(name="email")
	private String email;
	
	
	
	



	



	public student(String firstname, String lasname, String email) 
	{
		// TODO Auto-generated constructor stub
		super();
		this.firstname = firstname;
		this.lasname = lasname;
		this.email = email;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLasname() {
		return lasname;
	}



	public void setLasname(String lasname) {
		this.lasname = lasname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "student [id=" + id + ", firstname=" + firstname + ", lasname=" + lasname + ", email=" + email + "]";
	}
	
	
	

}
