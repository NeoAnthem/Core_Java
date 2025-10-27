package day03;

import java.util.Scanner;

//WAP To check whether the number is postive or negative
public class If1 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("Number: "+num+" is positive");
		}else {
			System.out.println("Number: "+num+" is Negative");
			
		}
		sc.close();
	}
}