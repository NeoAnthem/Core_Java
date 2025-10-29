package day05;

import java.util.Scanner;

// WAP to print fibonacci series till n
// n = 10
// 0 1 1 2 3 5 8 13 21 34 ....

public class For2 {

//	End / Array/Collection/String

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to display fibonacci sereis: ");
		int n = sc.nextInt();

		int prevNum = 0, currNum = 1;

		if (n > 0) {
			System.out.println("Fibonacci series till " + n + ": ");
			if (n > 1) {
				System.out.print(prevNum + " " + currNum + " ");

			} else {
				System.out.print(prevNum + " ");

			}

		} else {
			System.out.println("Enter positive number to generate series");
		}

		for (int i = 3; i <= n; i++) {
			int nextNum = prevNum + currNum;
			System.out.print(nextNum + " ");

			// swap
			prevNum = currNum;
			currNum = nextNum;
		}
		sc.close();
	}
}

