package day14;

public class Wrapper2 {
	
	public static void main(String[] args) {
		// Boxing -> Converting primitive variable into Wrapper Class Object
		
		int num = 50;
		
		Integer wrapperNum = Integer.valueOf(num); // Boxing
		// Auto Boxing -> Converting primitive variable into Wrapper Class Object
		
		Integer wrapperAutoNum = num; // AutoBoxing
		
		System.out.println("Boxing = "+wrapperNum);
		System.out.println("Auto Boxing = "+wrapperAutoNum);
		
		// Unboxing -> converting wrapper class objects into primitive type
		Double decimalWrapper = 5.1656; // Autoboxing 
		
		double decimalUnboxManual = decimalWrapper.doubleValue(); // Unboxing
		
		double decimalUnbox = decimalWrapper; // Auto Unboxing
		
		System.out.println("Unbox Manual = "+decimalUnboxManual);
		System.out.println("Unbox Auto = "+decimalUnbox);
		
		
		Float decimalFloatNum = decimalWrapper.floatValue(); // Explicit Type Casting
		
		System.out.println(decimalFloatNum);
		
		
	}

}