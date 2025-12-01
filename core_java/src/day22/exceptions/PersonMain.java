package day22.exceptions;

import java.io.FileNotFoundException;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person();

		try {
			person.acceptAge(-99);
		} catch (FileNotFoundException | AgeIncorrect e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try {
			person.acceptAge(0);
		} catch (FileNotFoundException | AgeIncorrect e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try {
			person.acceptAge(10);
			System.out.println(person);
		} catch (FileNotFoundException | AgeIncorrect e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("Hello");
	}

}