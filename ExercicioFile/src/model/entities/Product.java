package model.entities;

public class Product {
	private String name;
	private Double value;
	private Integer quantity;
	
	public Product() {
	}
	
	public Product(String name, Double value, Integer quantity) {
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double total() {
		return quantity * value;
	}
	
	@Override
	public String toString() {
		return name
			+ ","
			+ String.format("%.2f", value)
			+ ","
			+ quantity;
	}
	
	public String toStringTotal() {
		return name
			+ ","
			+ String.format("%.2f",total());
	}
}
