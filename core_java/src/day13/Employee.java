package day13;

public record Employee(int empId, String name, double salary) {

	
	public Employee(int empId, String name) {
		this(empId, name, 0);
	}
}