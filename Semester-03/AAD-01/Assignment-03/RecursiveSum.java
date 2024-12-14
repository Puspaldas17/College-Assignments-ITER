import java.util.Scanner;
//question no 1
public class RecursiveSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();        
        int sum = sumOfNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
    public static int sumOfNaturalNumbers(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumOfNaturalNumbers(n - 1);
        }
    }
}
