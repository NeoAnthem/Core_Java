package day03;

import java.util.Scanner;

// WAP to accept 2 numbers and operator(+,-,*,/)
// Based on operator perform results

// Input = 3 Condition = 5
public class If3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1, n2;
		char operator;

		System.out.println("Enter 2 numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		System.out.println("Choose operator [+, -, *, /]");
		operator = sc.next().charAt(0);
		int result;
		if (operator == '+') {
			result = n1 + n2;
			/* System.out.println("Addition of "+n1+", "+n2+" is "+result); */
			System.out.printf("Addition of %d, %d is %d", n1,n2,result);
		}
		else if (operator == '-') {
			result = n1 - n2;
			System.out.printf("Substraction of %d, %d is %d", n1,n2,result);
		}
		else if (operator == '*') {
			result = n1 * n2;
			System.out.printf("Multiplication of %d, %d is %d", n1,n2,result);
		}
		else if (operator == '/') {
			if(n2 == 0) {
				System.out.println("Cannot Divide By Zero");
			}else {
				result = n1 / n2;
				System.out.printf("Division of %d, %d is %d", n1,n2,result);
				
			}
		}else {
			System.out.println("Inavlid Operator");
		}
		sc.close();

	}

}