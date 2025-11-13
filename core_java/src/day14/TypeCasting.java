package day14;

public class TypeCasting {
	
	public static void main(String[] args) {
		int n1 = 4;
		
		int n2 = 3;
		// pow(n1 -> int is passed to double without any error
		// bcoz int is smaller data type and double is higher data type
		// implicit type casting happens.
		
		int cube = (int)Math.pow(n1, n2); // explicit typecasting
	
		System.out.println(n1 + " raise to "+n2 +" = "+cube );
	}

}