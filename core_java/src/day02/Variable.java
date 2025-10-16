package day02;

public class Variable {
	
	public static void main(String[] args) {
		
		int age = 30;
		System.out.println("Value of age = "+age);
		
		long num = 10_000_000_000L;
		System.out.println("Value of long number = "+num);
		
		char alp = 'H';
		System.out.println("Value of alphabet = "+alp);
		
		float pi = 3.14F;
		System.out.println("Value of decimal float = "+pi);
		
		double d = 85.58965;
		System.out.println("Value of decimal double = "+d);
		
		boolean isPrime = false;
		System.out.println("Prime status = "+isPrime);
		
	}

}

// Variable: Named Container To store defined data
/*
 * PRIMITIVE DATA TYPE
 * 1. byte -> Whole Number -> 1byte = 8bits 
 * 		   -> range -2^7 to 0 to 2^7 - 1
 * 		   -> -128 to 0 to 127
 * 2. short -> Whole Number -> 2 byte = 16bits
 * 			-> -2^15 to (2^15)-1
 * 3. int -> Whole Number -> 4byte
 * 4. long -> Whole Number -> 8byte
 * 5. float -> Decimal Numbers -> 4byte
 * 6. double -> Decimal Numbers -> 8byte
 * 7. char -> 2byte -> unicode encoding
 * 8. boolean -> True / False -> 1bit
 * 
 * */	

/*
 * Non Primitive
 * 1. String
 * 2. Arrays
 * 3. Objects
 * */