//  3. WAP to check whether the character is a number or upper case
//  or lower case or special character

package day03;
import java.util.Scanner;

public class If7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // Read single character

        if (Character.isDigit(ch)) {
            System.out.println("It is a Number.");
        } else if (Character.isUpperCase(ch)) {
            System.out.println("It is an Uppercase Letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("It is a Lowercase Letter.");
        } else {
            System.out.println("It is a Special Character.");
        }

        sc.close();
    }
}
