package day06;

import java.util.Scanner;

//3. WAP to print series of prime number from 1 to n

public class Fn2 {

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to check prime or not? ");
		int n = sc.nextInt();
		if (isPrime(n)) {
			System.out.println("Number = " + n + " is a prime number");
		} else {
			System.out.println("Number = " + n + " is a not prime number");

		}
		sc.close();
	}

}