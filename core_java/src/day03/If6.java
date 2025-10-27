//  2. WAP to check last digit of number is divisible by 3 or not
//  Ex: n = 189, last_digit = 9 -> number: 189, lastdigit: 9 is divisible by 3

package day03;
import java.util.Scanner;

public class If6 {
	public static void main(String[] args) {
		int num, lastDigit;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		
		lastDigit = num % 10;
		if(lastDigit % 3 == 0) {
			System.out.println("Number: " + num + ", Last digit: " + lastDigit + " is divisible by 3");
		} else {
			System.out.println("Number: " + num + ", Last digit: " + lastDigit + " is not divisible by 3");
		}
		sc.close();
	}
}
