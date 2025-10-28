// WAP to print factorial of n

package day04;
import java.util.Scanner;

public class Wh3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 1;
        int fact = 1;

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            while (i <= n) {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        }

        sc.close();
	}

}
