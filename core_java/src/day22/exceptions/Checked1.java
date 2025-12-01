package day22.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Checked1 {

	public static void main(String[] args)  {

		File file = new File("demo.txt");
		
		System.out.println(file);
		Scanner sc  = null;
		try {
		sc = new Scanner(file);
		
		// code 
		System.out.println("File Opened Successfully");
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			// irrespective of try/catch execution, 
			// finally will always execute
			
			System.out.println("Finally executed");
			if(sc != null) {
				sc.close();
				System.out.println("File Closed SUccessfully");
			}
		}	
	}
}