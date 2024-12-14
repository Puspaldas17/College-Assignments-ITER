import java.util.Scanner;

public class SetBitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int setBitCount = countSetBits(number);

        System.out.println("Number of set bits: " + setBitCount);

        scanner.close();
    }

    public static int countSetBits(int number) {
        int count = 0;
        while (number != 0) {
            count += number & 1;  // Increment count if the least significant bit is 1
            number >>= 1;         // Right shift the number by 1 bit
        }
        return count;
    }
}
