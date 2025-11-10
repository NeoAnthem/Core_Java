package day11;

import java.util.Scanner;

public class Casio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("Enter number 1: ");
		n1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		n2 = sc.nextInt();

		System.out.println("Select\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
		int choice = sc.nextInt();

		char operator = '0';
		switch (choice) {
		case 1:
			operator = '+';
			break;
		case 2:
			operator = '-';
			break;
		case 3:
			operator = '*';
			break;
		case 4:
			operator = '/';
			break;
		}
		sc.close();
		Calculator calculator = new Calculator();
		calculator.doCalculation(n1, n2, operator);
		
//		calculator.brand = "Natraj";
		System.out.println("Brand = "+ calculator.brand);
		System.out.println("Brand = "+ Calculator.brand);

	}

}