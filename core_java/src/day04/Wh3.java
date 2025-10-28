// WAP to print factorial of n

package day04;
import java.util.Scanner;

public class Wh3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = n;
        int fact = 1;

		while(i >= 1) {
			fact = fact * i;
			
			i--;
		}
		System.out.println("The factorial of "+n+" is "+ fact);

        sc.close();
	}

}
