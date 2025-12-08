package com.sprk.main;


import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.sprk.connection.DbConnection;
import com.sprk.dao.StudentDao;
import com.sprk.model.Student;
import com.sprk.util.Utility;

public class SelectAllMain {

	public static void main(String[] args) {
		try {
			StudentDao studentDao = new StudentDao(
					DbConnection.getConnection("root", "root", "jdbc:mysql://localhost:3306/jdbc_demo"));

		
			List<Student> allStudents = studentDao.getAllStudents();
			
			
			
			if(allStudents.isEmpty()) {
				System.out.println("No Data Found!\nPlease create few students");
			}else {
				allStudents.forEach(System.out::println);
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}