package day12.abstraction;

public class Employee extends Person {

	private int empId;

	private double salary;

	public Employee() {
		System.out.println("Employee Default Constructor");
	}

	public Employee(String name, int age, String gender, int empId, double salary) {
		super(name, age, gender);
		System.out.println("Parameterized Constructor Employee");
		this.empId = empId;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString()+"Employee [empId=" + empId + ", salary=" + salary + "]";
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello Hello From Employee");
		
	}
	
	public void sayEmployee() {
		System.out.println("Employee Employee...");
	}
}