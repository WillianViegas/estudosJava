package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double areaRetangulo() {
		return width * height;
	}
	
	public double perimetroRetangulo() {
		return 2 * (width + height);
	}
	
	public double diagonalRetangulo() {
		return Math.sqrt(width * width + height * height);
	}
}
