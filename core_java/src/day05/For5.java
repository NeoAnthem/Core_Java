// 3. WAP to print series of prime number from 1 to n

package day05;
import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers from 1 to " + n + " are:");

        // Loop through numbers from 2 to n
        for (int currentNumber = 2; currentNumber <= n; currentNumber++) {
            boolean isPrime = true;

            // Check if currentNumber is divisible by any number other than 1 and itself
            for (int divisor = 2; divisor <= currentNumber / 2; divisor++) {
                if (currentNumber % divisor == 0) {
                    isPrime = false;
                    break;  // no need to check further
                }
            }

            if (isPrime) {
                System.out.print(currentNumber + " ");
            }
        }

        sc.close();
    }
}
