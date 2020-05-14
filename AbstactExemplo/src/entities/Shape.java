package entities;

import enitties.enums.Color;

public abstract class Shape {
	private Color colors;
	
	public Shape() {
	}
	
	public Shape(Color colors) {
		this.colors = colors;
	}

	public Color getColors() {
		return colors;
	}

	public void setColors(Color colors) {
		this.colors = colors;
	}
	
	public abstract double area();
}
