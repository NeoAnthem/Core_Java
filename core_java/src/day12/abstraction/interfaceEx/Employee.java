package day12.abstraction.interfaceEx;

public class Employee implements Person {
	
	private int empId;
	
	private String name;
	
	private int age;
	
	private double salary;

	
	
	public Employee(int empId, String name, int age, double salary) {
		System.out.println("Param Constructor Employee");
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	@Override
	public void deductTax() {
		System.out.println("15% Tax Deducted i.e. "+0.15*salary);
		salary = salary - 0.15*salary;
	}
	



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}





	@Override
	public void sayHello() {
		System.out.println("Hello Hello From Employee");
	}

}