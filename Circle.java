public class Circle {
    // Fields
    private double radius;
    final double PI = 3.14159;
    // Constructor
    public Circle(double r) {
        radius = r;
    }
    // Second constructor. They can share names, but not arguments
    public Circle() {
        radius = 0.0;
    }
    // Setters
    public void setRadius(double r) {
        radius = r;
    }
    // Getters
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return PI * radius * radius;
    }
    public double getDiameter() {
        return radius * 2;
    }
    public double getCircumference() {
        return 2 * PI * radius;
    }
}