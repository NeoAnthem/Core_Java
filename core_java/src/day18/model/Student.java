package day18.model;

public class Student implements Comparable<Student>{
	
	private int rollNo;
	private String name;
	private String department;
	private double percentage;
	
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}



	public Student(int rollNo, String name, String department, double percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
		this.percentage = percentage;
	}



	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", department=" + department + ", percentage="
				+ percentage + "]";
	}



	@Override
	public int compareTo(Student obj) {
		// TODO Auto-generated method stub
//		return Integer.compare(rollNo, obj.rollNo);
//		return Integer.compare(percentage, obj.percentage);
		return Integer.compare(name.length(), obj.name.length());
		
//		if(rollNo < obj.rollNo) {
//			return -1;
//		}else if(rollNo > obj.rollNo) {
//			return 1;
//		}else {
//			return 0;
//		}
	}
	
	
}
