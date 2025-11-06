package day10.multilevel;

public class Employee extends Person {

	protected int empId;

	protected double employeeSalary;

	public Employee() {
		System.out.println("Default cosntructor of Employee");
	}

	public Employee(String name, int age, String gender, int empId, double employeeSalary) {

		super(name, age, gender);
		System.out.println("Employee with parameterized values created");
		this.empId = empId;
		this.employeeSalary = employeeSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", employeeSalary=" + employeeSalary + ", toString()=" + super.toString()
				+ "]";
	}
	
	public void calculateTax() {
		if(employeeSalary >= 15000) {
			System.out.println("15% tax deducted");
			employeeSalary = employeeSalary - 0.15*employeeSalary;
		}else {
			System.out.println("No tax deducted");
		}
	}
	
	
	
	
}