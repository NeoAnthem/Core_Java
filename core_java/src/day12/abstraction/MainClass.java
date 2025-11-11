package day12.abstraction;

public class MainClass {

	public static void main(String[] args) {
//		Person person = new Person("Shubhangi Ganga",20,"Female");
		
		
		Employee employee = new Employee("Pratik Mhatre",30,"Male",10001,2500);
		
		System.out.println(employee);
		employee.sayHello();
		employee.sayEmployee();
		
		
	}
}