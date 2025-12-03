package com.sprk.model;

import java.sql.Timestamp;

public class Student {
	
	private int rollNo;
	
	private String firstName;

	private String lastName;
	
	private String gender;
	
	private Timestamp accCreatedAt;
	
	private Timestamp accUpdatedAt;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(int rollNo, String firstName, String lastName, String gender, Timestamp accCreatedAt,
			Timestamp accUpdatedAt) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.accCreatedAt = accCreatedAt;
		this.accUpdatedAt = accUpdatedAt;
	}

	


	public Student(String firstName, String lastName, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}



	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Timestamp getAccCreatedAt() {
		return accCreatedAt;
	}

	public void setAccCreatedAt(Timestamp accCreatedAt) {
		this.accCreatedAt = accCreatedAt;
	}

	public Timestamp getAccUpdatedAt() {
		return accUpdatedAt;
	}

	public void setAccUpdatedAt(Timestamp accUpdatedAt) {
		this.accUpdatedAt = accUpdatedAt;
	}



	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", accCreatedAt=" + accCreatedAt + ", accUpdatedAt=" + accUpdatedAt + "]";
	}
	
	
}
