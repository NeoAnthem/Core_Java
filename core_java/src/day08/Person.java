package day08;

public class Person {

	// FIELDS
	private String name;
	
	private int age;
	
	private String gender;
	
	private boolean active;
	
	// constructor -> Method
	// Default Constructor -> No Paramters
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	
	Person(){
		System.out.println("Default constructor of Person Class");
		
		name = "SPRk";
		age = 35;
		gender = "Female";
		active = true;
	}
	
	// parameterized constructor
	Person(String name, int age, String gender, boolean active){
		System.out.println("Parameterized constructor of Person Class");
		this.name = name;
		this.age=age;
		this.gender = gender;
		this.active = active;
				
	}
	
	

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	//	ALT+ SHIFT + Y -> WORD WRAP
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", active=" + active + "]";
	}
	
	
}