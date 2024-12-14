import java.util.Scanner;

public class BitSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the position of the first bit (i): ");
        int i = scanner.nextInt();

        System.out.print("Enter the position of the second bit (j): ");
        int j = scanner.nextInt();

        int swappedNumber = swapBits(number, i, j);

        System.out.println("Number after swapping bits: " + swappedNumber);

        scanner.close();
    }

    public static int swapBits(int number, int i, int j) {
        // Extract the i-th and j-th bits
        int ithBit = (number >> i) & 1;
        int jthBit = (number >> j) & 1;

        // Check if the bits are different
        if (ithBit != jthBit) {
            // Create a mask for the i-th and j-th bits
            int mask = (1 << i) | (1 << j);

            // XOR the number with the mask to swap the bits
            number ^= mask;
        }

        return number;
    }
}
