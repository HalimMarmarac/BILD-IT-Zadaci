package zadaci_19_02_2016;

/*
 * Octagon class
 */

public class Octagon extends GeometricObject implements Cloneable {

	// all 8 sides of the octagon have equal length
	double side;
	// default constructor
	public Octagon() {
		this(1);
	}

	public Octagon(double side) {
		this.side = side;
	}
	// returns area
	public double getArea() {
		return (2.0 + 4.0 / Math.sqrt(2) * side * side);
	}
	// returns perimeter
	public double getPerimeter() {
		return side * 8;
	}

	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return o;
	}
	// equals override method
	public boolean equals(Object o) {
		return o instanceof Octagon && getArea() == ((Octagon) o).getArea();
	}

}
