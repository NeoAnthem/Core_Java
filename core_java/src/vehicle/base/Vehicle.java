package vehicle.base;

public class Vehicle {
	
	// Fields
	protected String brand;
		
	protected String model;
		
	protected double price;
		
	public Vehicle() {
		System.out.println("Default constructor of class Vehicle");
		}
	
	// parameterized constructor
	public Vehicle(String brand, String model, double price) {
		System.out.println("Parameterized constructor of class Vehicle");
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	
}
