import java.util.Scanner;

public class ParityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check its parity: ");
        int number = scanner.nextInt();

        if (checkParity(number) == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        scanner.close();
    }

    public static int checkParity(int number) {
        return number % 2;  // Returns 0 for even numbers and 1 for odd numbers
    }
}
