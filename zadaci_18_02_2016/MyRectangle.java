package zadaci_18_02_2016;

public class MyRectangle extends GeometricObject {

	public double width;
	public double height;
	// constructor with 2 sides
	public MyRectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	// default constructor
	public MyRectangle() {
		this(1, 1);
	}
	// next lines getters and setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// returns the perimeter of the rectangle
	public double getPerimeter() {
		return width * 2 + height * 2;
	}

	// returns the area of the rectangle
	public double getArea() {
		return width * height;
	}

	public String toString() {
		return "width = " + width + " ,  height = " + height;
	}
}
