package com.sprk.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.sprk.connection.DbConnection;
import com.sprk.dao.StudentDao;
import com.sprk.model.Student;
import com.sprk.util.Utility;

public class SelectRollMain {

	public static void main(String[] args) {
		try {
			StudentDao studentDao = new StudentDao(
					DbConnection.getConnection("root", "123456", "jdbc:mysql://localhost:3306/sprk"));

			Scanner sc = Utility.getScanner();

			System.out.println("Enter roll no:");
			int rollNo = sc.nextInt();
			Student student = studentDao.findByRollNo(rollNo);
			
			
			
			if(student != null) {
				System.out.println(student);
			}else {
				System.out.println("Student with roll no = "+rollNo+" not found");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
