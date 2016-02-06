package zadaci_06_02_2016;

/*
 * Zadatak3
 * MyPoint class
 */

public class MyPoint {

	public double x;
	public double y;

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public MyPoint() {
		this(0, 0);
	}

	public double x() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double y() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// calculating the distance between 2 points
	public double distance(double x, double y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}
	// returns distance calculated with distance method
	public double distance(MyPoint point) {
		return distance(point.x, point.y);
	}

}