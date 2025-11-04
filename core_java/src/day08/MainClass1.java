package day08;

// constructor
public class MainClass1 {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		
		System.out.println(p1);
		
		Person p2 = new Person("Abdul", 25, "Male", false);
		
		System.out.println(p2);
		
		// Obj is created with default constructor
		// now i want to modify default values
		// changes private -> setters
		p1.setName("Rohan Pandey");
		p1.setGender("Male");
		p1.setActive(false);
		p1.setAge(55);
		System.out.println(p1);
		
	}

}
// Lombok Project -> @Annotation