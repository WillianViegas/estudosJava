package entities;

public class Company extends TaxPayer{
	private int employeeNumber;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int employeeNumber) {
		super(name, anualIncome);
		this.employeeNumber = employeeNumber;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public double tax() {
		if(employeeNumber > 10) {
			return anualIncome * 0.14;
		}
		else {
			return anualIncome * 0.16;
		}
	}
}
