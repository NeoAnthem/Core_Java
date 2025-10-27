package day03;

import java.util.Scanner;

// WAP to accept marks of 5 subject print sum and avg
//Based on avg display grades
/*
 * avg between 100 to 90 -> A Grade
 * avg between 89 to 70-> B Grade
 * avg between 69 to 50-> C Grade
 * avg between 49 to 35-> D Grade
 * avg below 35-> Fail
 * */
public class If4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m1, m2, m3, m4, m5, sum, avg;
		System.out.println("Enter marks of 5 subject: ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();

		sum = m1 + m2 + m3 + m4 + m5;
		
		avg = sum / 5;
		
		System.out.println("Total Marks = "+sum);
		System.out.println("Average Marks = "+avg);
		if(m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35) {
			// Calculate grades
			if(avg >= 90) {
				System.out.println("A Grade");
			}
			else if(avg >= 70) {
				System.out.println("B Grade");
				
			}
			else if(avg >= 50) {
				System.out.println("C Grade");
				
			}
			else{
				System.out.println("D Grade");
				
			}
		}
		else {
			
			System.out.println("Fail");
		}
		sc.close();
	}

}
