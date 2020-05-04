package entities;

public class Product {

	//boas praticas deixar os m�todos privados
	private String name;
	private double price;
	private int quantity;
	
	//construct: obriga que a entrada de dados aconte�a antes de instanciar
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	//usar m�tods padr�es para acessar atributos privados
	//getName : acessar o atributo
	public String getName() {
		return name;
	}
	
	//setName: definir valor ao atributo
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f",totalValueInStock());
				
	}
}
