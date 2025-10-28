package day04;

import java.util.Scanner;

// WAP to print sum of digits
// n = 183 -> 3 + 8 + 1 = 12
public class Wh5 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int i = n;
		int sum = 0, lastDigit;
		while( i != 0) {
			
			lastDigit = i % 10;
			sum = sum + lastDigit;
			
			// Decrement -> /10 (Log )
			i = i / 10;
			
		}
		
		System.out.println("The sum of digit of "+n+" = "+sum);
	}

}

// WAP to print number in reverse order
// 183 -> 381