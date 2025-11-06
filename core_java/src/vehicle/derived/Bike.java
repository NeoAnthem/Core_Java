package vehicle.derived;

import vehicle.base.Vehicle;

public class Bike extends Vehicle{
	
	String engineType;
	
	public Bike() {
		System.out.println("Default constructor of class Bike");
	}
	
	// parameterized constructor
		public Bike(String brand, String model, double price, String engineType) {
			System.out.println("Parameterized constructor of class Vehicle");
			this.brand = brand;
			this.model = model;
			this.price = price;
			this.engineType = engineType;
		}

	@Override
	public String toString() {
		
		return  super.toString() + "Bike [engineType=" + engineType + "]";
	}
	
}
