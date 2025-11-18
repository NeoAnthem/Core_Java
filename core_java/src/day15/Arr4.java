package day15;

import java.util.Scanner;

public class Arr4 {
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		int i;
		
		// accept input in arrays
		for(i = 0; i < arr.length;i++) {
			System.out.println("Enter element at position "+i+": ");
			arr[i] = sc.nextInt();
		}
		
		// DISPLAY
		System.out.println("Elements are: ");
		for(i=0; i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}	
	}
	

}