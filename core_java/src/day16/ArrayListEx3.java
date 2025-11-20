package day16;

import java.util.ArrayList;

import day16.model.Student;

public class ArrayListEx3 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Ruchi Sharma",10002,"Female",85.55));
		students.add(new Student("Shruti Shinde",10010,"Female",42.82));
		students.add(new Student("Rohit Sharma",10003,"Male",68.85));
		students.add(new Student("Abdul Memon",10005,"Male",46.55));
		
		System.out.println("All students are: ");
		for(Student theStudent: students) {
			System.out.println(theStudent);
		}
	}

}


// Employee -> name, empId, gender, salary
// Store 5 empls in List

// List of Numbers -> any order data store
// Display that List, later on Sort the list in Asc then display
// Sort in desc then display (do not use reverse)
