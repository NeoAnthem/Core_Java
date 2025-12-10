package com.sprk.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.sprk.connection.DbConnection;
import com.sprk.dao.CourseDao;
import com.sprk.model.Course;
import com.sprk.util.Utility;

public class CourseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = Utility.getScanner();
		do {
		
			System.out.println("Press\n1. Add New Course  \n2. List of All Course");
			System.out.println("3. Get Course by Course Id \n4. Update Course By Id");
			System.out.println("5. Delete Course by Course  \n6. Exit");

			choice = sc.nextInt();

			try {
				switch (choice) {
				case 1: {
					addCourse();
					break;
				}
				case 2: {
					getAllCourseDetails();
					break;
				}
				case 3: {
					getCourseDetailsById();
					break;
				}
				case 4: {
					UpdateCourseDetails();
					break;
				}
				case 5: {
					deleteCourseDetailsById();
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
		


	/* This is Course related Method */

	private static void addCourse() throws Exception {
		// TODO Auto-generated method stub
		CourseDao courseDao = new CourseDao(
				DbConnection.getConnection("root", "123456", "jdbc:mysql://localhost:3306/sprk"));

		Scanner sc = Utility.getScanner();

		System.out.println("Enter Course name:");
		String courseName = sc.nextLine();
		System.out.println("Enter the Duration:");
		String duration = sc.nextLine();
		System.out.println("Enter the fees ");
		double fee = sc.nextDouble();

		Map<String, String> errors = new HashMap();

		if (courseName == null || courseName.isBlank()) {
			errors.put("courseName", "Course Name cannot be empty");
		}
		if (duration == null || duration.isBlank()) {
			errors.put("duration", "Duration cannot be empty");

		}
		if (fee <= 0) {
			errors.put("fees", "Fee must be in positive");
		}
		if (errors.size() > 0) {
			errors.forEach((k, v) -> {
				System.err.println(k + " : " + v);
			});
			return;
		}

		Course course = new Course(courseName, duration, fee);

		int result = courseDao.insertStudent(course);

		if (result > 0) {
			System.out.println("Course Details Saved Successfully");
		} else {
			System.out.println("Something Bad Happens");
		}

	}

	private static void getAllCourseDetails() throws Exception {
		CourseDao courseDao = new CourseDao(
				DbConnection.getConnection("root", "123456", "jdbc:mysql://localhost:3306/sprk"));
		List<Course> allCourse = courseDao.getAllCouses();

		if (allCourse.isEmpty()) {
			System.out.println("No Data Found!\nPlease create few course");
		} else {
			allCourse.forEach(System.out::println);
		}

	}

	private static void getCourseDetailsById() throws Exception {
		CourseDao courseDao = new CourseDao(
				DbConnection.getConnection("root", "123456", "jdbc:mysql://localhost:3306/sprk"));
		Scanner sc = Utility.getScanner();

		System.out.println("Enter Course Id:");
		int CourseId = sc.nextInt();
		Course course = courseDao.findByCourseId(CourseId);

		if (course != null) {
			System.out.println(course);
		} else {
			System.out.println("Course details for Course Id is  = " + CourseId + " not found");
		}

	}

	private static void UpdateCourseDetails() throws Exception {
		// TODO Auto-generated method stub
		CourseDao courseDao = new CourseDao(
				DbConnection.getConnection("root", "123456", "jdbc:mysql://localhost:3306/sprk"));

		Scanner sc = Utility.getScanner();
		System.out.println("Enter Course id for update the details:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Updated Course name:");
		String courseName = sc.nextLine();
		System.out.println("Enter  Update the Duration:");
		String duration = sc.nextLine();
		System.out.println("Enter  Update the fees ");
		double fee = sc.nextDouble();

		Map<String, String> errors = new HashMap();

		if (courseName == null || courseName.isBlank()) {
			errors.put("courseName", "Course Name cannot be empty");
		}
		if (duration == null || duration.isBlank()) {
			errors.put("duration", "Duration cannot be empty");

		}
		if (fee <= 0) {
			errors.put("fees", "Fee must be in positive");
		}
		if (errors.size() > 0) {
			errors.forEach((k, v) -> {
				System.err.println(k + " : " + v);
			});
			return;
		}

		Course course = new Course(courseName, duration, fee);

		int result = courseDao.updateCourse(id, course);

		if (result > 0) {
			System.out.println("Course Details Updated Successfully");
		} else {
			System.out.println("Something Bad Happens");
		}

	}

	private static void deleteCourseDetailsById() throws Exception {
		CourseDao courseDao = new CourseDao(
				DbConnection.getConnection("root", "123456", "jdbc:mysql://localhost:3306/sprk"));

		Scanner sc = Utility.getScanner();

		System.out.println("Enter Course Id:");
		int courseId = sc.nextInt();
		boolean result = courseDao.deleteCourse(courseId);

		if (result) {
			System.out.println("Course detail with course Id= " + courseId + " deleted successfully");
		} else {
			System.out.println("Something bad happen");
		}


	}

	}

