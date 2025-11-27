package day21;

import java.util.Objects;

public class Employee2 {

	private int empId;
	
	private String name;
	
	private String gender;
	
	public Employee2() {
		// TODO Auto-generated constructor stub
	}
	

	public Employee2(int empId, String name, String gender) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
	}



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", gender=" + gender + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}
		
		Employee2 empObj = (Employee2) obj;
		
		return (this.empId == empObj.empId) && (this.name == empObj.name) &&(this.gender == empObj.gender);

	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(empId, name, gender);
	}
	
	
	
}