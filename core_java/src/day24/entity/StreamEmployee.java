package day24.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

		employees.forEach((theEmp) -> {
			System.out.println("------------------------------------------------------");
			System.out.println("Employee Information");
			System.out.println(theEmp);
		});

		// Employee Who earns highest salary
		Double maxSalary = employees.stream().map((emp) -> emp.getSalary()).max(Double::compare).get();

		System.out.println("Max Salary = " + maxSalary);
		List<Employee> maxSalariedEmployees = employees.stream().filter((emp) -> emp.getSalary().equals(maxSalary))
				.toList();

		System.out.println("Maximum Salaried Employees are = ");
		maxSalariedEmployees.forEach((theEmp) -> {
			System.out.println("------------------------------------------------------");
			System.out.println("Employee Information");
			System.out.println(theEmp);
		});

		// Find Employee with second highest salary
		
		Double secondHighSalary=employees.stream()	
				.map((emp)->(emp.getSalary()))
				.distinct()
				.sorted((o1,o2)->(Double.compare(o2,o1)))
				.skip(1)
				.max(Double::compare)
				.get();	
				
				List<Employee> maxSecondSalary=
						employees.stream()
						.filter((emp)->(emp.getSalary().equals(secondHighSalary)))
						.toList();
						
				maxSecondSalary.forEach((theEmp)->{
					System.out.println("---------------------------------------------------------");
					System.out.println("Employee Information");
					System.out.println(theEmp);
				});
		
		// q3: Find Employees who is oldest(senior most) // min(joiningDate)

//		Employee seniorEmployee = employees.stream().min((e1, e2) -> {
//			return e1.getJoiningDate().compareTo(e2.getJoiningDate());
//		}).get();

		Employee seniorEmployee = employees.stream().min((e1, e2) -> e1.getJoiningDate().compareTo(e2.getJoiningDate()))
				.get();

		System.out.println("------------------------------------------------------");
		System.out.println("Oldest Employee Information");
		System.out.println(seniorEmployee);

		// 4. Find total employees based on gender
		// Male : count, Female: count -> Map<String, Long>

//		employees.stream().collect(Collectors.groupingBy(emp -> {
//			return emp.getGender();
//		}, Collectors.counting()));

		Map<String, Long> genderCount = employees.stream()
				.collect(Collectors.groupingBy(emp -> emp.getGender(), Collectors.counting()));

		System.out.println("Count By Gender");
		System.out.println(genderCount);
	}

}