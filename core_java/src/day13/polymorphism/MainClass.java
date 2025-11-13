package day13.polymorphism;

// Method overloading -> Compile Time Polymorphism
class Calculator {

	public void addition(int n1, int n2) {
		System.out.println("Addition of 2 integer is = " + (n1 + n2));
	}

	public void addition(double n1, int n2) {
		System.out.println("Addition of 2 decimal is = " + (n1 + n2));
	}

	public void addition(int n1, int n2, int n3) {
		System.out.println("Addition of 3 integer is = " + (n1 + n2 + n3));
	}

}

public class MainClass{
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		calculator.addition(2,5);
		calculator.addition(3.5,5);
		calculator.addition(5, 5,2);
	}
}