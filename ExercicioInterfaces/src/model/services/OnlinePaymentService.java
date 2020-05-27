package model.services;

public interface OnlinePaymentService {
	
	public abstract double paymentFee(double amount);
	
	public abstract Double interest(Double amount, Integer months);

}
