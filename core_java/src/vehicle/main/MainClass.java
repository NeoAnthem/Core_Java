package vehicle.main;

import vehicle.derived.Car;
import vehicle.derived.Bike;

public class MainClass {
	
	public static void main(String[] args) {
		Car c1 = new Car("Dodge", "Viper", 5500, 5);
		
		Bike b1 = new Bike("BMW", "GS310", 2300, "V8");
		
		System.out.println(c1);
		System.out.println(b1);
	}	
}
