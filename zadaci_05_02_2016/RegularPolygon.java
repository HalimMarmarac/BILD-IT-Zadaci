package zadaci_05_02_2016;

/*
 * Zadatak2
 * RegularPolygon class
 */

public class RegularPolygon {
	// private fields
    private int NumberOfSides;
    private double SideLength;
    private double CenterX;
    private double CenterY;
    // default constructor
    public RegularPolygon() {
        NumberOfSides = 3;
        SideLength = 1;
        CenterX = 0;
        CenterY = 0;

    }
    // constructor with num of sides and side length
    public RegularPolygon(int numberOfSides, double sideLength) {
        this();
        SideLength = sideLength;
        NumberOfSides = numberOfSides;

    }
    // constructor with all parameters
    public RegularPolygon(int numberOfSides, double sideLength, double x, double y) {
        this(numberOfSides, sideLength);
        CenterX = x;
        CenterY = y;
    }

    public int getNumberOfSides() {
        return NumberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        NumberOfSides = numberOfSides;
    }

    public double getSideLength() {
        return SideLength;
    }

    public void setSideLength(double sideLength) {
        SideLength = sideLength;
    }

    public double getCenterY() {
        return CenterY;
    }

    public void setCenterY(double centerY) {
        CenterY = centerY;
    }

    public double getCenterX() {
        return CenterX;
    }

    public void setCenterX(double centerX) {
        CenterX = centerX;
    }

    public double getPerimeter(){
        return NumberOfSides * SideLength;
    }
    // returns area of polygon
    public double getArea() {
        return (NumberOfSides * SideLength * SideLength) / (4.0 * Math.tan(Math.PI / NumberOfSides));
    }

}
