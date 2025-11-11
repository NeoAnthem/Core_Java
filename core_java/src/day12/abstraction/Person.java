package day12.abstraction;

public abstract class Person {
	
	protected String name;
	protected int age;
	protected String gender;
	
	public Person() {
		System.out.println("Person Default Constructor");
	}

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// Abstract Method
	public abstract void sayHello();
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
