package Services;

public class UsaInterestService implements InterestService{
	private double interestRate;
	
	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterest() {
		return interestRate;
	}
}
