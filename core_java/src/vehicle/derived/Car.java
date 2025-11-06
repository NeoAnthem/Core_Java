package vehicle.derived;

import vehicle.base.Vehicle;

public class Car extends Vehicle{
	
	int seatingCapacity;
	
	public Car() {
		System.out.println("Default constructor of class Car");
	}

	
	// parameterized constructor
		public Car(String brand, String model, double price, int seatingCapacity) {
			System.out.println("Parameterized constructor of class Vehicle");
			this.brand = brand;
			this.model = model;
			this.price = price;
			this.seatingCapacity = seatingCapacity;
		}
		
	@Override
	public String toString() {
		return super.toString() + "Car [seatingCapacity=" + seatingCapacity + "]";
	}
	
	
}
