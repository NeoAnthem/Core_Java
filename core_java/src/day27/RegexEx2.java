package day27;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexEx2 {
	
//	Accept password and check it contains 8 char or not
	
	public static void main(String[] args) {
		String pw;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter password min length 8");
		
		pw = sc.next();

		
		if(Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[^\\s]{8,}$", pw)) {
			System.out.println("Password is correct");
			System.out.println("PW = "+pw);
		}else {
			System.out.println("Password is incorrect");
			System.out.println("PW = "+pw);	
		}
		sc.close();
	}
	

}