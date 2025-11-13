package day13;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee = new Employee(1001, "Abdul gani", 120);
		
		System.out.println("Employee Info");
		System.out.println("Name = "+employee.name());
		System.out.println("Emp Id = "+employee.empId());
		System.out.println("Salary = "+employee.salary());
		
		
		System.out.println(employee);
		
		Employee employee2 = new Employee(102, "Rohan");
		
		System.out.println(employee2);
	}
}