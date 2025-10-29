package day05;

import java.util.Scanner;

// WAP to print cube of number till n
public class For1 {

//	End / Array/Collection/String

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int cube = i * i * i;
			System.out.println("The cube of " + i + " = " + cube);
		}
		sc.close();

	}

}