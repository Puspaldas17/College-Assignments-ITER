import java.util.Scanner;

public class circle {
   
    private double radius;

    
    public circle(double radius) {
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

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the radius of the circle: ");
            double userRadius = scanner.nextDouble();

    
            circle circle = new circle(userRadius);


            System.out.println("Radius: " + circle.getRadius());

            System.out.println("Area: " + circle.calculateArea());

            System.out.print("Enter a new radius: ");
            userRadius = scanner.nextDouble();
            circle.setRadius(userRadius);

            System.out.println("Updated Radius: " + circle.getRadius());
            System.out.println("Updated Area: " + circle.calculateArea());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
