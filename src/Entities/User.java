package Entities;

import Abstract.Entity;

public class User implements Entity {

	private int id;
	private String email;
	private String firstName;
	private String lastName;
	private String tcNumber;
	private int yearOfBirth;

	public User() {

	}

	public User(int id, String email, String firstName, String lastName, String tcNumber, int yearOfBirth) {

		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tcNumber = tcNumber;
		this.yearOfBirth = yearOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getTcNumber() {
		return tcNumber;
	}

	public void setTcNumber(String tcNumber) {
		this.tcNumber = tcNumber;
	}
	
	public int getyearOfBirth() {
		return yearOfBirth;
	}

	public void setyearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

}
