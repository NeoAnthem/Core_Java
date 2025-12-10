package com.sprk.main;

import java.util.List;
import java.util.Scanner;

import com.sprk.connection.DbConnection;
import com.sprk.dao.EnrollmentDao;
import com.sprk.model.Enrollment;
import com.sprk.util.Utility;

public class EnrollmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = Utility.getScanner();
		do {

			System.out.println("Press\n1. Add New Enrollmnet for Course");

			System.out.println("2. Get Enrollment By StudentId");
			choice = sc.nextInt();

			try {
				switch (choice) {
				case 1: {
					addNewEnrollment();
					break;
				}
				case 2: {
					getEnrollmentByStudent();
					break;

				}
				case 3: {
					System.out.println("Thanks for using! Do visit again!!");
					break;
				}
				default:
					System.out.println("Please try again with correct input");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (choice != 3);
	}

	private static void addNewEnrollment() throws Exception {
		// TODO Auto-generated method stub
		EnrollmentDao enrollmentDao = new EnrollmentDao(
				DbConnection.getConnection("root", "root", "jdbc:mysql://localhost:3306/jdbc_demo"));

		Scanner sc = Utility.getScanner();
		System.out.print("Student ID: ");
		int sid = sc.nextInt();
		System.out.print("Course ID: ");
		int cid = sc.nextInt();
		sc.nextLine();
		int result = enrollmentDao.insertEnrollment(sid, cid);

		if (result > 0) {
			System.out.println("Enrolled course Successfully");
		}

		else {
			System.out.println("Something bad happen");
		}
	}

	private static void getEnrollmentByStudent() throws Exception {
		// TODO Auto-generated method stub
		System.out.print("Student ID: ");
		EnrollmentDao enrollmentDao = new EnrollmentDao(
				DbConnection.getConnection("root", "root", "jdbc:mysql://localhost:3306/jdbc_demo"));

		Scanner sc = Utility.getScanner();
		int sid = sc.nextInt();
		sc.nextLine();
		List<Enrollment> list = enrollmentDao.getEnrollmentByStudent(sid);
		if (list.isEmpty()) {
			System.out.println("No enrollments");
		} else {
			list.forEach(System.out::println);
		}
	}

}