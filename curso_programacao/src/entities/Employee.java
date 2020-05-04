package entities;

public class Employee {
	public String name;
	public double gSalary;
	public double tax;
	
	public double calcSalary() {
		return gSalary - tax;
	}
	
	public double increaseSalary(double perc) {
		return gSalary - tax + ((gSalary * perc)/100 );
	}
}
