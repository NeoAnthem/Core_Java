//  4. WAP to display msg based on criteria
//  a. if number is divisible by 5 -> BUZZ
//  b. if number is divisible by 3 -> FIZZ
//  c. if number is divisible by 3 and 5 both -> FIZZBUZZ
//  d. if number is not divisible by 3 and 5 both -> number

package day03;
import java.util.Scanner;

public class If8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FIZZBUZZ");
        } else if (num % 3 == 0) {
            System.out.println("FIZZ");
        } else if (num % 5 == 0) {
            System.out.println("BUZZ");
        } else {
            System.out.println(num);
        }

        sc.close();
    }
}
