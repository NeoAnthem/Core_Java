package day06;

import java.util.Scanner;

public class Fn1 {

	// Function Declaration

	public static void addition() {
		// Logic

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int result = n1 + n2;
		
		System.out.println("Addition of "+n1+", "+n2+" = "+result);
		sc.close();
	}
	
	public static void subtraction(int n1, int n2) {
		int result = n1-n2;
		
		System.out.println("Subtraction of "+n1+", "+n2+" = "+result);
		
	}
	
	public static boolean isAgeSatisfied(int age) {
		if(age < 18) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		addition();
		
		int n1 = 50;
		int n2 = 10;
		subtraction(n1,n2);
	}
}