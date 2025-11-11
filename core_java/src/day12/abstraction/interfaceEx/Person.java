package day12.abstraction.interfaceEx;

public interface Person {

	// fields -> final + static
	String COMPANY_NAME = "SPRK";
	
	// abstract method
	void sayHello();
	void deductTax();
	
	static void sayPerson(){
		System.out.println("Person Method");
	}
}