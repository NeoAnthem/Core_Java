package day13.aggregation;

public class Address {
	
	private String societyName;
	
	private String pinCode;
	
	private String city;
	
	private String country;
	
	public Address() {
		System.out.println("Default constructor of Address");
}

	public Address(String societyName, String pinCode, String city, String country) {
		
		this.societyName = societyName;
		this.pinCode = pinCode;
		this.city = city;
		this.country = country;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [societyName=" + societyName + ", pinCode=" + pinCode + ", city=" + city + ", country="
				+ country + "]";
	}
	
	

}