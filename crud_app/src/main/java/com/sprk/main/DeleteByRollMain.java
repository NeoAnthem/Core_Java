package com.sprk.main;

import java.util.Scanner;

import com.sprk.connection.DbConnection;
import com.sprk.dao.StudentDao;
import com.sprk.model.Student;
import com.sprk.util.Utility;

public class DeleteByRollMain {

	public static void main(String[] args) {
		try {
			StudentDao studentDao = new StudentDao(
					DbConnection.getConnection("root", "123456", "jdbc:mysql://localhost:3306/sprk"));

			Scanner sc = Utility.getScanner();

			System.out.println("Enter roll no:");
			int rollNo = sc.nextInt();
			boolean result = studentDao.deleteStudent(rollNo);
			
			
			
			if(result) {
				System.out.println("Student with roll no = "+rollNo+" deleted successfully");
			}else {
				System.out.println("Something bad happen");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}