// 1. WAP to check whether the number is Armstrong number or not

package day05;
import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sumOfCubes = 0;

        // Convert negative to positive (Armstrong numbers are generally positive)
        if (number < 0) {
            number = -number;
            originalNumber = -originalNumber;
        }

        // Use for loop to calculate sum of cubes of digits
        for (int temp = number; temp != 0; temp = temp / 10) {
            int digit = temp % 10;
            sumOfCubes += (digit * digit * digit);
        }

        if (sumOfCubes == number) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
