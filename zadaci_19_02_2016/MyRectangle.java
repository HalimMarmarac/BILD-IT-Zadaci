package zadaci_19_02_2016;

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
	// equals method
	public boolean equals(Object o) {
        return o instanceof MyRectangle && getArea() == ((MyRectangle) o).getArea();
    }
	
	public String toString() {
		return "width = " + width + " ,  height = " + height;
	}
}
