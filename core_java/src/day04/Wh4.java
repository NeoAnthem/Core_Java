// WAP to print table of 5 till 10 iterations

package day04;

public class Wh4 {
    public static void main(String[] args) {
        int num = 5;
        int i = 1;

        System.out.println("Table of " + num + ":");

        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}
