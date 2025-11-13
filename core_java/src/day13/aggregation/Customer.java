package day13.aggregation;

public class Customer {

	private String customerName;

	private int age;

	private String phone;

	private Address address;

	public Customer() {
		System.out.println("Default of Customer");
	}

	public Customer(String customerName, int age, String phone, Address address) {
		
		this.customerName = customerName;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", age=" + age + ", phone=" + phone + ", address=" + address
				+ "]";
	}
	
	
	
	

}