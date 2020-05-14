package entities;

import enitties.enums.Color;

public class Circle extends Shape{

	private Double radius;
	
	public Circle() {
		super();
	}
	
	
	public Circle(Color colors, Double radius) {
		super(colors);
		this.radius = radius;
	}



	public Double getRadius() {
		return radius;
	}


	public void setRadius(Double radius) {
		this.radius = radius;
	}


	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
 
}
