package day05;

import java.util.Scanner;

public class Wh1 {
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter a number: ");
		n = sc.nextInt();
		
		int i = n, reverse = 0;
		
		while(i != 0) {
			int lastDigit = i % 10;
			
			reverse = reverse * 10 + lastDigit;
			
			i = i / 10;
		}
		
		System.out.println("Value of n = "+n+", Reverse = "+reverse);
		sc.close();
	}

}