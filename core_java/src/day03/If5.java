//  1. WAP to check whether the number contains 3 digit or not
//  Number can be positive or negative

package day03;
import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Convert negative to positive
        if (num < 0) {
            num = num * -1;
        }

        // Check if number has exactly 3 digits
        if (num >= 100 && num <= 999) {
            System.out.println("The number contains 3 digits.");
        } else {
            System.out.println("The number does NOT contain 3 digits.");
        }

        sc.close();
    }
}
