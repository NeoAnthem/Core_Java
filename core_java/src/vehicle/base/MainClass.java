package vehicle.base;

public class MainClass {
	public static void main(String[] atgs) {
		Vehicle v1 = new Vehicle();
		
		v1.brand = "Dodge";
		v1.model = "Charger";
		v1.price = 5000;
		
		System.out.println(v1);
	}
}
