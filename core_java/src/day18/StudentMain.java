package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import day18.model.Student;


public class StudentMain {

	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(10,"Shruti Gupta","Mechanical",85.55));
		students.add(new Student(5,"Abhishek Verma","Computers",60.88));
		students.add(new Student(1,"Om Sharma","IT",88.66));
		students.add(new Student(3,"Nikhil Shine","Civil",91.22));
		
		System.out.println("Before sorting by roll no");
		students.forEach(stud-> System.out.println(stud));
		
		/*
		 * students.sort(null); System.out.println("After sorting by roll no in ASC");
		 * students.forEach(stud-> System.out.println(stud));
		 */
		/*
		 * students.sort(Collections.reverseOrder());
		 * System.out.println("After sorting by roll no in DESC");
		 * students.forEach(stud-> System.out.println(stud));
		 */
		
		
		/*
		 * students.sort(null);
		 * System.out.println("After sorting by percentage in ASC");
		 * students.forEach(stud-> System.out.println(stud));
		 */
		/*
		 * students.sort(null);
		 * System.out.println("After sorting by name length in ASC");
		 * students.forEach(stud-> System.out.println(stud));
		 */

		students.sort(null);
		System.out.println("After sorting by name alphabetical in ASC");
		students.forEach(stud-> System.out.println(stud));
	}
}