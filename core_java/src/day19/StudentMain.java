package day19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import day19.model.Student;

public class StudentMain {
	
	public static void main(String[] args) {
	List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(10,"Shruti Gupta","Computers",85.55));
		students.add(new Student(5,"Abhishek Verma","Computers",60.88));
		students.add(new Student(1,"Om Sharma","IT",88.66));
		students.add(new Student(13,"Nikhil Shinde","Civil",91.22));
		students.add(new Student(2,"Memon Abdul Gani","Mechanical",85.55));
		students.add(new Student(6,"Rohit Sharma","Electronics",91.22));
		students.add(new Student(4,"Saurav Dahihande","IT",91.22));
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Before sorting by Percentage");
		students.forEach(stud-> System.out.println(stud));

		Comparator<Student> comparator = (s1,s2)->{
			
			if(Double.compare(s2.getPercentage(), s1.getPercentage()) == 0) {
				return Integer.compare(s1.getRollNo(), s2.getRollNo());
			}
			
			return Double.compare(s2.getPercentage(), s1.getPercentage());
		};
		
		students.sort(comparator);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("After sorting by Percentage in DESC and if percentage is repeated then sort by rollno in ASC");
		students.forEach(stud-> System.out.println(stud));
		
		
	}

}