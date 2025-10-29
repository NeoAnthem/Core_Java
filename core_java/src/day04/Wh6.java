// WAP to print number in reverse order
// 183 -> 381

package day04;

import java.util.Scanner;

public class Wh6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int revNum = 0;
        int temp = num;  

        while (num != 0) {
            int lastDigit = num % 10;    
            revNum = (revNum * 10) + lastDigit;
            num = num / 10;   
        }

        System.out.println("Original number : " + temp);
        System.out.println("Reversed number : " + revNum);

        sc.close();
    }
}
