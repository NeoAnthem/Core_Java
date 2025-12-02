package com.sprk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {

	public static void main(String[] args) {
		
		try {
			// Step 1: Register Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Step 2: Create connection
			
			String username = "root";
			String password = "123456";
			String url = "jdbc:mysql://localhost:3306/sprk";
			
			Connection connection = DriverManager.getConnection(url, username, password);
			
			String createTableQuery = "create table student(roll_no int primary key auto_increment, first_name varchar(100) not null, last_name varchar(100) not null, gender enum('Male', 'Female','Other'), acc_created_at timestamp default current_timestamp, last_update timestamp on update current_timestamp)";
			
			// Step 3: Create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(createTableQuery);
			
			// Step 4: Execute Query
			preparedStatement.execute();
			
			// Step 5: Close All
			preparedStatement.close();
			connection.close();
			
			System.out.println("Table created successfully");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(SQLException e) {
			
			System.out.println(e.getMessage());
		}
	}

}