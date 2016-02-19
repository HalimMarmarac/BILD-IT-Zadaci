package zadaci_18_02_2016;

import zadaci_18_02_2016.Colorable;

class Square extends GeometricObject implements Colorable {

	private double x;
	private double y;
	private double side;
	// default construictor
	Square() {
		this(0, 0, 10);
	}
	// constructor with parameters
	Square(double x, double y, double side) {
		this.x = x;
		this.y = y;
		this.side = side;
	}
	// next lines getters and setters
	public double getArea() {
		return side * side;
	}

	public double getPerimeter() {
		return side * 4;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	// how to color display message
	public String howToColor() {
		return "Color all four sides.";
	}

}
