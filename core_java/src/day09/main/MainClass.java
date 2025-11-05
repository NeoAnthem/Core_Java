package day09.main;

import day09.derived.Student;

public class MainClass {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setAge(30);
		s1.setGender("Female");
		s1.setName("Rohini Sable");
		s1.setPercentage(85.55);
		s1.setRollNo(10);
		
		Student s2 = new Student(85, "Male", "Rohit", 15, 35.66);
		
		System.out.println(s1);
		System.out.println(s2);
	
	}

}