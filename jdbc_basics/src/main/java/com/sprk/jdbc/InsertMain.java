package com.sprk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain {

	public static void main(String[] args) {

		try {
			// Step 1: Register Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2: Create connection

			String username = "root";
			String password = "123456";
			String url = "jdbc:mysql://localhost:3306/sprk";

			Connection connection = DriverManager.getConnection(url, username, password);
			String firstName, lastName;
			int gender;

			String genderStr;

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter first name:");
			firstName = sc.nextLine();
			System.out.println("Enter last name:");
			lastName = sc.nextLine();
			System.out.println("Select Gender\n1. Male\n2. Female\n3. Others ");
			gender = sc.nextInt();
			
			if (firstName == null || firstName.isBlank()) {
				System.out.println("First Name Cannot Be Empty");
				return;
			}
			if (lastName == null || lastName.isBlank()) {
				System.out.println("Last Name Cannot Be Empty");
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
			default:
				genderStr = null;
			}

			String insertQuery = "insert into student(first_name, last_name, gender) values (?, ?, ?)";

			// Step 3: Create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			preparedStatement.setString(3, genderStr);

			// Step 4: Execute Query
			int result = preparedStatement.executeUpdate();

			// Step 5: Close All
			preparedStatement.close();
			connection.close();
			if (result > 0) {
				System.out.println("Data Inserted successfully");
			} else {
				System.out.println("Something Bad Happens");

			}
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
	}

}