package day05;

import java.util.Scanner;

public class Wh3 {
	
//	Perfect Number
// Sum of divisor except number should be equal to number then that is a perfect number
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check perfect or not: ");
		int n = sc.nextInt();
		
		int i = 1;// start
		
		int sum = 0;
		while(i < n) {
			
			if(n % i ==0) {
				// number is divisible
				sum = sum + i;
			}
			i++;
		}
		
		if(n == sum) {
			System.out.println("Number = "+n+" is a perfect number");
		}else {
			System.out.println("Number = "+n+" is not a perfect number, Bcoz sum = "+sum);
		}
		sc.close();
	}

}