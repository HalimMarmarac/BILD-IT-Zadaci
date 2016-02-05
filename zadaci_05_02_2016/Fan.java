package zadaci_05_02_2016;

/*
 * Zadatak1
 * Fan class
 */
public class Fan {
	// constants
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    // fan specs
    private int Speed;
    private boolean On;
    private double Radius;
    private String Color;
    // default constructor
    public Fan() {
        Speed = 1;
        Radius = 5;
        Color = "blue";
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public boolean isOn() {
        return On;
    }

    public void setOn(boolean on) {
        On = on;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
    // to string method returning data
    public String toString() {
        if (isOn()) {
            return "Speed: " + getSpeed() + "   Color: " + getColor() + "   Radius: " + getRadius();
        } else {
            return "Color: " + getColor() + "   Radius: " + getRadius() + "   The fan is OFF.";
        }
    }

}
