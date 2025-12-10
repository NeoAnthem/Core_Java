package day23.strings;

public class Str1 {

	public static void main(String[] args) {
		String str1 = "Hello";
		
		String str2 = str1;
		
		String str3 = new String("Hello");
		
		String str4 = "Hello";
		
		System.out.println("Str1 == Str2 ?"+(str1 == str2));
		System.out.println("Str1 == Str3 ?"+(str1 == str3));
		System.out.println("Str1 == Str4 ?"+(str1 == str4));
	}
}