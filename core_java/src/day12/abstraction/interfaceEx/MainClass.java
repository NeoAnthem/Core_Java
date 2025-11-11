package day12.abstraction.interfaceEx;

public class MainClass {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee(1001, "Abdul Gani", 25, 1000);
		
		employee.deductTax();
		
		System.out.println(employee);
		
		// reference of base class object of derived class is called as dynammic method dispatch
		Person person = new Employee(1002, "Rohini Jadhav", 20, 2500);
		
		person.sayHello();
		person.deductTax();
		System.out.println(person.toString());
	
	}

}