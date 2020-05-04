package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double conversor(double  dollar, double price) {
		return dollar * price * (1.0 + IOF);
	}

}
