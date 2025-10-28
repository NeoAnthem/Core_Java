package day04;

import java.util.Scanner;

// WAP to print first n natural numebr in reverse order
// n = 15
// 15 14 13 12 10 .... 1
public class Wh2 {
	
	public static void main(String[] args) {
		int n;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		
		int i = n;// start
		
		while(i>=1) {
			System.out.print(i+"\t");
			i--;
		}
		sc.close();
	}

}
