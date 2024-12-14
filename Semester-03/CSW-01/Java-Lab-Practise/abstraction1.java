import java.util.Scanner;
// Abstract class Shape
abstract class Shape {
    abstract double calculateArea();
}
// Concrete subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius must be positive.");
        }
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Concrete subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be positive.");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be positive.");
        }
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

// Main program to demonstrate abstraction and user input
public class abstraction1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Circle input
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            Circle circle = new Circle(radius);

            // Rectangle input
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(length, width);

            // Output areas
            System.out.println("Circle Area: " + circle.calculateArea());
            System.out.println("Rectangle Area: " + rectangle.calculateArea());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
