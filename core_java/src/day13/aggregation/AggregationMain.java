package day13.aggregation;

public class AggregationMain {
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		customer.setAge(25);
		customer.setCustomerName("Rohit Jadhav");
		customer.setPhone("+91 12345 12345");
		
		System.out.println(customer);
		
		Address address = new Address();
		
		address.setCity("Navi Mumbai");
		address.setSocietyName("Demo CHS");
		address.setCountry("India");
		address.setPinCode("410206");
		
		customer.setAddress(address);
		
		System.out.println(customer);
	}
}
