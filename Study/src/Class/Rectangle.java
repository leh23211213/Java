
import java.util.Scanner;

public class Rectangle {
    private double length, width;

    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        length = Double.parseDouble(sc.nextLine());
        width = Double.parseDouble(sc.nextLine());
        sc.close();
    }

    private double getArea() {
        return length * width;
    }

    private double getPerimeter() {
        return (length + width) * 2;
    }

    public void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
