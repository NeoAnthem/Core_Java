package com.sprk.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.sprk.connection.DbConnection;
import com.sprk.dao.StudentDao;
import com.sprk.model.Student;
import com.sprk.util.Utility;

public class CRUDMain {

	public static void main(String[] args) {
		int choice;

		Scanner sc = Utility.getScanner();

		do {
			System.out.println("Press\n1. Add New Students\n2. List of All Students");
			System.out.println("3. Get Student by Roll Number\n4. Update Student By Roll No");
			System.out.println("5. Delete Student by Roll Number\n6. Exit");

			choice = sc.nextInt();

			try {
				switch (choice) {

				case 1: {
					addStudent();
					break;
				}
				case 2: {
					allStudent();
					break;
				}
				case 6: {
					System.out.println("Thanks for using! Do visit again!!");
					break;
				}
				default:
					System.out.println("Please try again with correct input");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (choice != 6);

	}

	private static void allStudent() throws Exception {
		
		StudentDao studentDao = new StudentDao(
				DbConnection.getConnection("root", "root", "jdbc:mysql://localhost:3306/sprk"));

	
		List<Student> allStudents = studentDao.getAllStudents();
		
		
		
		if(allStudents.isEmpty()) {
			System.out.println("No Data Found!\nPlease create few students");
		}else {
			allStudents.forEach(System.out::println);
		}


	}

	private static void addStudent() throws Exception {

		StudentDao studentDao = new StudentDao(
				DbConnection.getConnection("root", "root", "jdbc:mysql://localhost:3306/sprk"));

		Scanner sc = Utility.getScanner();

		System.out.println("Enter first name:");
		String firstName = sc.nextLine();
		System.out.println("Enter last name:");
		String lastName = sc.nextLine();
		System.out.println("Select Gender\n1. Male\n2. Female\n3. Others ");
		int gender = sc.nextInt();

		String genderStr = null;

		Map<String, String> errors = new HashMap();

		if (firstName == null || firstName.isBlank()) {
			errors.put("firstName", "First name cannot be empty");
		}
		if (lastName == null || lastName.isBlank()) {
			errors.put("lastName", "Last name cannot be empty");

		}

		if (errors.size() > 0) {
			errors.forEach((k, v) -> {
				System.err.println(k + " : " + v);
			});
			return;
		}

		switch (gender) {
		case 1: {

			genderStr = "Male";
			break;
		}
		case 2: {

			genderStr = "Female";
			break;
		}
		case 3: {

			genderStr = "Other";
			break;
		}
		}

		Student student = new Student(firstName, lastName, genderStr);

		int result = studentDao.insertStudent(student);

		if (result > 0) {
			System.out.println("Student Saved Successfully");
		} else {
			System.out.println("Something Bad Happens");
		}
	}
}