package day10;

public class Dog extends Animal {

	public Dog() {
		System.out.println("Dog object created");
	}
	public void bark() {
		System.out.println("Dog is barking");
	}
	
	@Override
	public void eat() {
		System.out.println("I am dog and I am eating");
	}
	
//	@Override
//	public void walk() {
//		System.out.println("I am dog and I am running");
//	}
	
	/*
	 * Method Overriding:
	 * Two or more method with the same name 
	 * one in base class and one in derived class 
	 * is called as method overriding
	 * 
	 * */
	
}