package zadaci_05_02_2016;

/*
 * Zadatak3
 * QuadraticEquation class
 */

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;
    // constructor for the object
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // next lines get and set methods
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    // calculate discriminant
    public double getDiscriminant() {
         return b * b - 4.0 * a * c;
    }
    // calculate root1
    public double getRoot1() {
            return  (-b + Math.pow(getDiscriminant(), 0.5)) / (2.0 * a);
    }
    // calculate root2
    public double getRoot2() {
            return  (-b - Math.pow(getDiscriminant(), 0.5)) / (2.0 * a);
    }

}
