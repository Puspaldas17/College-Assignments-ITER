import java.util.Scanner;
abstract class shape1 {
    abstract double area();
    abstract double perimeter();
}
class Circle1 extends shape1 {
    private double radius;
    public Circle1(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle1 extends shape1 {
    private double length;
    private double width;
    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length * width;
    }
    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}
class Triangle extends shape1 {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    double area() {
        return 0.5 * base * height;
    }
    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }
}
public class inheritance1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Circle1 input
        System.out.print("Enter the radius of the Circle1: ");
        double radius = scanner.nextDouble();
        Circle1 Circle1 = new Circle1(radius);
        // Rectangle1 input
        System.out.print("Enter the length of the rectangle1Rectangle1: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle1Rectangle1: ");
        double width = scanner.nextDouble();
        Rectangle1 rectangle1Rectangle1 = new Rectangle1(length, width);
        // Triangle input
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        System.out.print("Enter the first side of the triangle: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the second side of the triangle: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the third side of the triangle: ");
        double side3 = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height, side1, side2, side3);
        // Output areas and perimeters
        System.out.println("Circle1 Area: " + Circle1.area());
        System.out.println("Circle1 Perimeter: " + Circle1.perimeter());
        System.out.println("Rectangle1 Area: " + rectangle1Rectangle1.area());
        System.out.println("Rectangle1 Perimeter: " + rectangle1Rectangle1.perimeter());
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
        scanner.close();
    }
}
