
import java.util.*;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] A = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        //Arrays.sort(A);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(A[n - i / 2 - 1] + " ");
            } else {
                System.out.print(A[i / 2] + " ");
            }
        }
        scanner.close();
    }
}