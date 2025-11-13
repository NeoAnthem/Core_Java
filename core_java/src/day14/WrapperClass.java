package day14;

public class WrapperClass {
	
	public static void main(String[] args) {
		int age = 10;
		
//		Integer wrapperAge = 10;
//		Integer wrapperAge = new Integer(10);
		Integer wrapperAge = Integer.valueOf(10);
		
		System.out.println(wrapperAge.toString());
		System.out.println(wrapperAge);
	}

}