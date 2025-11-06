package day10.multilevel;

public class MainClass1 {

	public static void main(String[] args) {
		PartTimeEmployee pt1 = new PartTimeEmployee("Sholk Sharma", 30, "Male", 1001, 1500, 25);
		
		pt1.calculateTax();
		System.out.println(pt1);
	}

}