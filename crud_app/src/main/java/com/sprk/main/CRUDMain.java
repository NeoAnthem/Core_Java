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
				case 3: {
                    getStudentByRoll();
                    break;
                }
                case 4: {
                    updateStudentByRoll();
                    break;
                }
                case 5: {
                    deleteStudentByRoll();
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
				DbConnection.getConnection("root", "123456", "jdbc:mysql://localhost:3306/sprk"));

	
		List<Student> allStudents = studentDao.getAllStudents();
		
		
		
		if(allStudents.isEmpty()) {
			System.out.println("No Data Found!\nPlease create few students");
		}else {
			allStudents.forEach(System.out::println);
		}


	}

	private static void addStudent() throws Exception {

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
    // --------- NEW: Get student by roll number ----------
    private static void getStudentByRoll() throws Exception {
        StudentDao studentDao = new StudentDao(
                DbConnection.getConnection("root", "123456", "jdbc:mysql://localhost:3306/sprk"));

        Scanner sc = Utility.getScanner();
        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        Student student = studentDao.getStudentByRoll(rollNo);
        if (student == null) {
            System.out.println("No student found with roll number: " + rollNo);
        } else {
            System.out.println("Student details:");
            System.out.println(student); // assumes Student.toString() is implemented
        }
    }

    // --------- NEW: Update student by roll number ----------
    private static void updateStudentByRoll() throws Exception {
        StudentDao studentDao = new StudentDao(
                DbConnection.getConnection("root", "123456", "jdbc:mysql://localhost:3306/sprk"));

        Scanner sc = Utility.getScanner();

        System.out.print("Enter Roll Number to update: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // consume newline

        Student existing = studentDao.getStudentByRoll(rollNo);
        if (existing == null) {
            System.out.println("No student found with roll number: " + rollNo);
            return;
        }

        System.out.println("Existing details: " + existing);

        // Prompt for new values (press enter to keep old)
        System.out.println("Enter new first name (press Enter to keep '" + existing.getFirstName() + "'):");
        String newFirst = sc.nextLine();
        if (newFirst == null || newFirst.isBlank()) {
            newFirst = existing.getFirstName();
        }

        System.out.println("Enter new last name (press Enter to keep '" + existing.getLastName() + "'):");
        String newLast = sc.nextLine();
        if (newLast == null || newLast.isBlank()) {
            newLast = existing.getLastName();
        }

        System.out.println("Select Gender\n1. Male\n2. Female\n3. Other\nPress Enter to keep '" + existing.getGender() + "'");
        String genderInput = sc.nextLine();
        String newGender = existing.getGender();
        if (genderInput != null && !genderInput.isBlank()) {
            try {
                int g = Integer.parseInt(genderInput);
                switch (g) {
                case 1:
                    newGender = "Male";
                    break;
                case 2:
                    newGender = "Female";
                    break;
                case 3:
                    newGender = "Other";
                    break;
                default:
                    newGender = existing.getGender();
                }
            } catch (NumberFormatException nfe) {
                // keep existing gender if invalid input
            }
        }

        // Basic validation
        Map<String, String> errors = new HashMap<>();
        if (newFirst == null || newFirst.isBlank()) {
            errors.put("firstName", "First name cannot be empty");
        }
        if (newLast == null || newLast.isBlank()) {
            errors.put("lastName", "Last name cannot be empty");
        }
        if (!errors.isEmpty()) {
            errors.forEach((k, v) -> System.err.println(k + " : " + v));
            System.out.println("Update aborted due to validation errors.");
            return;
        }

        // apply updates
        existing.setFirstName(newFirst);
        existing.setLastName(newLast);
        existing.setGender(newGender);

        int rows = studentDao.updateStudent(existing);
        if (rows > 0) {
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("No changes saved. Something went wrong.");
        }
    }

    // --------- NEW: Delete student by roll number ----------
    private static void deleteStudentByRoll() throws Exception {
        StudentDao studentDao = new StudentDao(
                DbConnection.getConnection("root", "123456", "jdbc:mysql://localhost:3306/sprk"));

        Scanner sc = Utility.getScanner();
        System.out.print("Enter Roll Number to delete: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // consume newline

        Student existing = studentDao.getStudentByRoll(rollNo);
        if (existing == null) {
            System.out.println("No student found with roll number: " + rollNo);
            return;
        }

        System.out.println("Student to delete: " + existing);
        System.out.print("Are you sure you want to delete this student? (y/n): ");
        String confirm = sc.nextLine();
        if (confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("yes")) {
        	int rows = studentDao.deleteStudentByRoll(rollNo);
            if (rows > 0) {
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Delete failed. Please try again.");
            }
        } else {
            System.out.println("Delete cancelled.");
        }
    }
}