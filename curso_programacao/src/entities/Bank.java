package entities;

public class Bank {
	private int number;
	private String holder;
	private double countValue;
	
	public Bank(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		//usando o m�todo pois no futuro se houver alguma modificacao
		//ser� mais f�cil de fazer manuten��o
		accountDeposit(initialDeposit);
	}
	
	public Bank(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder(){
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getcountValue() {
		return countValue;
	}
	
	public void accountDeposit(double value) {
		this.countValue += value;
	}
	
	public void accountWithdraw(double value) {
		this.countValue -= value + 5;
	}
	
	public void responseString() {
		System.out.printf("Account %d, "
				+ "Holder: %s, "
				+ "Balance: $ %.2f%n", 
				getNumber(), getHolder(), getcountValue());
	}
	
	//metodo toString retorna a mensagem direta em string;
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", countValue);
	}
}
