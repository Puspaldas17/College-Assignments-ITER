import java.util.Scanner;

public class PowerCalculator {

    // Recursive method to calculate base raised to the power exp
    public static double power(double base, int exp) {
        // Base case: any number to the power of 0 is 1
        if (exp == 0) {
            return 1;
        }
        // If the exponent is negative, calculate the power for positive exponent
        else if (exp < 0) {
            return 1 / power(base, -exp);
        }
        // Recursive case: multiply base by the result of the power function with exp - 1
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = power(base, exponent);

        System.out.printf("%.2f raised to the power of %d is %.2f%n", base, exponent, result);
        
        scanner.close();
    }
}
