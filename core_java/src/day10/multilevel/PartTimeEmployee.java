package day10.multilevel;

public class PartTimeEmployee extends Employee {

	private double dailyWage;
	private int numOfDays;

	public PartTimeEmployee() {
		System.out.println("Default cosntructor of PartEmployee");
	}

	public PartTimeEmployee(String name, int age, String gender, int empId, double dailyWage,
			int numOfDays) {
		super(name, age, gender, empId, dailyWage*numOfDays);
		System.out.println(
"Part Time Employee with parameterized values created");
		this.dailyWage = dailyWage;
		this.numOfDays = numOfDays;
	}
	
	@Override
	public void calculateTax() {
		System.out.println("No Tax For Part Time Employee");
	}

	public double getDailyWage() {
		return dailyWage;
	}

	public void setDailyWage(double dailyWage) {
		this.dailyWage = dailyWage;
	}

	public int getNumOfDays() {
		return numOfDays;
	}

	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [dailyWage=" + dailyWage + ", numOfDays=" + numOfDays + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

}