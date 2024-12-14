
import java.util.Scanner;

public class Polymorphism1 {

    // Addition
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Polymorphism1 mathOps = new Polymorphism1();
        Scanner scanner = new Scanner(System.in);

        try {
            // User input for integer operations
            System.out.print("Enter first integer: ");
            int int1 = scanner.nextInt();
            System.out.print("Enter second integer: ");
            int int2 = scanner.nextInt();

            System.out.println("Integer Addition: " + mathOps.add(int1, int2));
            System.out.println("Integer Subtraction: " + mathOps.subtract(int1, int2));
            System.out.println("Integer Multiplication: " + mathOps.multiply(int1, int2));
            System.out.println("Integer Division: " + mathOps.divide(int1, int2));

            // User input for double operations
            System.out.print("Enter first double: ");
            double double1 = scanner.nextDouble();
            System.out.print("Enter second double: ");
            double double2 = scanner.nextDouble();

            System.out.println("Double Addition: " + mathOps.add(double1, double2));
            System.out.println("Double Subtraction: " + mathOps.subtract(double1, double2));
            System.out.println("Double Multiplication: " + mathOps.multiply(double1, double2));
            System.out.println("Double Division: " + mathOps.divide(double1, double2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
