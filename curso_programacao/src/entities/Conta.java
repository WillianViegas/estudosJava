package entities;

public class Conta {
	private int numero;
	private String titular;
	private double valorConta;
	
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
	
	public Conta(int numero, String titular, double valorInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(valorInicial);
	}

	public int getNumero() {
		return numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getValorConta() {
		return valorConta;
	}
	
	public void deposito(double valor) {
		this.valorConta += valor;
	}
	
	public void saque(double valor) {
		this.valorConta -= valor + 5.0;
	}

	public String toString() {
		return "Conta: "
			+ numero
			+ ", Titular: "
			+ titular
			+ ", Valor da Conta: $ "
			+ String.format("%.2f",valorConta);
	}
	
}
