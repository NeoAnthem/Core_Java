package day13.polymorphism;

// Run Time Polymorphism
public class RunTimeMain {

	public static void main(String[] args) {
		Cat cat = new Cat();
		
		cat.walk();
	}
}

class Animal{
	
	public void walk() {
		System.out.println("Animal is walking");
	}
}

class Cat extends Animal{
	@Override
	public void walk() {
		System.out.println("Cat is running");
	}
}