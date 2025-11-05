package day09.derived;

import day09.base.Person;

public class Student extends Person{
	
	// name, age, gender, rollno, percentage	
	
	private int rollNo;

	private double percentage;
	
	public Student() {
		super();
		System.out.println("Default constructor of Student Class");
	}

	public Student(int age, String gender, String name, int rollNo, double percentage) {
		super(name,age,gender); // parameterized construtor call of base class
		System.out.println("Parameterized constructor of Student Class");
		this.rollNo = rollNo;
		this.percentage = percentage;
	}

	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", percentage="
				+ percentage + "]" + super.toString();
	}
}