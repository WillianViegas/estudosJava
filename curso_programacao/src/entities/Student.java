package entities;

public class Student {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double somaNotas() {
		return n1 + n2 + n3;
	}
	
	public double faltaNota(double nota) {
		return 60.00 - nota;
	}
}
