package com.sprk.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.sprk.connection.DbConnection;
import com.sprk.dao.StudentDao;
import com.sprk.model.Student;
import com.sprk.util.Utility;

public class InsertMain {

	public static void main(String[] args) {
		try {
			StudentDao studentDao = new StudentDao(
					DbConnection.getConnection("root", "123456", "jdbc:mysql://localhost:3306/sprk"));

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
			
			if(errors.size() > 0) {
				errors.forEach((k,v)->{
					System.err.println(k +" : "+v);
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
			
			if(result > 0) {
				System.out.println("Student Saved Successfully");
			}else {
				System.out.println("Something Bad Happens");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
