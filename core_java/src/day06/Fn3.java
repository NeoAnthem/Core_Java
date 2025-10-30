package day06;

import java.util.Scanner;

//3. WAP to print series of prime number from 1 to n

public class Fn3 {

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				// Not Prime
				return false;
			}
		}
		return true;
	}
	
	public static void generatePrimeNumberSeries() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to print series of prime number: ");
		int n = sc.nextInt();
		sc.close();
		if(n <= 1) {
			System.out.println("For prime number series, number should be positive integer greater than 1");
			
			return;
		}
		
		System.out.println("Series of prime number till "+n);
		for(int i = 2; i<= n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		generatePrimeNumberSeries();
	}
}