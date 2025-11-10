package day11.finalEx;

public class MainClass {

	public static void main(String[] args) {
		Earth earth = new Earth();
		
		Moon moon = new Moon();
		
		earth.valueOfPi();
		moon.valueOfPi();
		
		Earth.valueOfPi();
		ConstantValues.valueOfPi();
		
		System.out.println(earth.VALUE_OF_GRAVITY);
	}
}