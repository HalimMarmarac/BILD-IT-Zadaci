package zadaci_10_02_2016;

public class Circle extends GeometricObject {

	private double radius;

	public Circle() {
	}
	// constructor with radius parameter
	public Circle(double radius) {
		this.radius = radius;
	}
	// constructor with radius, color and filed?true/false
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	// return radius
	public double getRadius() {
		return radius;
	}

	// set radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// calculate area
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// calculate diameter
	public double getDiameter() {
		return 2 * radius;
	}

	// calculate parimeter
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	public String toString() {
		return "Circle (radius = " + radius + ")";
	}

}
