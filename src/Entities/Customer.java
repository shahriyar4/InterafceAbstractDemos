package Entities;

import java.time.LocalDate;

import Abstract.Entity;

public class Customer implements Entity{

	
	public int id;
	public String firstname;
	public String lastName;
	public LocalDate dateOfBirth;
	public String nationallyId;
	
	
	public Customer(int id, String firstname, String lastName, LocalDate dateOfBirth, String nationallyId) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationallyId = nationallyId;
		
		
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


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getNationallyId() {
		return nationallyId;
	}


	public void setNationallyId(String nationallyId) {
		this.nationallyId = nationallyId;
	}
	
	
	
}
