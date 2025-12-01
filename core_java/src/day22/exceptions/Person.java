package day22.exceptions;

import java.io.FileNotFoundException;

public class Person {
	
	private int age;
	
	void acceptAge(int age) throws AgeIncorrect, FileNotFoundException{
		if(age < 0 || age > 150) {
			throw new AgeIncorrect("Age cannot be negative or greater than 150 years");
		}
		if(age == 0) {
			throw new FileNotFoundException("File Not Found Exception Demo");
			
		}
		
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}
	
	

}