import java.util.Scanner;

public class EvenDigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int evenDigitCount = 0;
        int tempNumber = Math.abs(number); // Handle negative numbers

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            if (digit % 2 == 0) {
                evenDigitCount++;
            }
            tempNumber /= 10;
        }

        System.out.println("Number of even digits: " + evenDigitCount);

        scanner.close();
    }
}
