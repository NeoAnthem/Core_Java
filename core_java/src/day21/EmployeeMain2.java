package day21;

import java.util.HashSet;
import java.util.Set;

public class EmployeeMain2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Shruti", "Female");

		Employee e2 = e1;

		Employee e3 = new Employee(1, "Shruti", "Female");

		// This will compare reference and not values
		Set<Employee> employees = new HashSet<Employee>();
		
		employees.add(e1);
		employees.add(e2); // compare hashCode repeated so skip
		employees.add(e3);
		
		employees.forEach(System.out::println);
	}

}