package day07;

import java.util.Scanner;

public class DriverClass3 {

	public static void main(String[] args) {
		Person personObj1 = new Person();

		// set person1 values by taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter full name: ");
		personObj1.name = sc.nextLine();
		
		System.out.println("Enter age: ");
		personObj1.age = sc.nextInt();

		System.out.println("Enter gender: ");
		personObj1.gender = sc.next();

		System.out.println("Enter activeness: ");
		personObj1.active = sc.nextBoolean();

		Person personObj2 = new Person();

		// set person2 values
		sc.nextLine();
		System.out.println("Enter full name: ");
		personObj2.name = sc.nextLine();
		
		System.out.println("Enter age: ");
		personObj2.age = sc.nextInt();

		System.out.println("Enter gender: ");
		personObj2.gender = sc.next();

		System.out.println("Enter activeness: ");
		personObj2.active = sc.nextBoolean();
		
		System.out.println(personObj1);
		System.out.println(personObj2);
		
		sc.close();
	}

}