package day24.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class StreamEmployee {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("Rohit Yadav", "Male", 20000.0, dateFormat.parse("20-05-2019")));
		employees.add(new Employee("Ashustosh Yadav", "Male", 20000.0, dateFormat.parse("25-10-2025")));
		employees.add(new Employee("Shruti Gupta", "Female", 25000.0, dateFormat.parse("25-12-2024")));
		employees.add(new Employee("Shivani Sharma", "Female", 25000.0, dateFormat.parse("25-10-2024")));
		employees.add(new Employee("Anjali Yadav", "Female", 18000.0, dateFormat.parse("10-12-2015")));
		employees.add(new Employee("Ashish Kokate", "Male", 19000.0, dateFormat.parse("25-10-2025")));
		employees.add(new Employee("Sahil Shinde", "Male", 15000.0, dateFormat.parse("29-12-2024")));
		
		
		
		employees.forEach((theEmp)->{
			System.out.println("------------------------------------------------------");
			System.out.println("Employee Information");
			System.out.println(theEmp);
		});
		
		// Employee Who earns highest salary
		Double maxSalary = 
				employees
				.stream()
				.map((emp)-> emp.getSalary())
				.max(Double::compare)
				.get();
		
		System.out.println("Max Salary = "+maxSalary);
		List<Employee> maxSalariedEmployees = employees
			.stream()
			.filter((emp)-> emp.getSalary().equals(maxSalary))
			.toList();
			
		
		System.out.println("Maximum Salaried Employees are = ");
		maxSalariedEmployees.forEach((theEmp)->{
			System.out.println("------------------------------------------------------");
			System.out.println("Employee Information");
			System.out.println(theEmp);
		});
		
		// Find Employee with second highest salary
	}

}