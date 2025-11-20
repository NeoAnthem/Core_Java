package day16.model;

public class Student {

	private String name;

	private int rollNo;

	private String gender;

	private double percentage;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollNo, String gender, double percentage) {

		this.name = name;
		this.rollNo = rollNo;
		this.gender = gender;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", gender=" + gender + ", percentage=" + percentage
				+ "]";
	}

}