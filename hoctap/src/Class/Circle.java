package Github.OOP.hoctap.src.Class;

public class Circle {
    private double radius;
    private final double pi = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }

    public double getPerimeter() {
        return pi * 2 * radius;
    }
}
