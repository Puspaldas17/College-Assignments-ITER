/*
import java.util.*;

public class rotate_k_pos {

    public static void rotate(int[] arr, int k) {
        k = k % arr.length; // Handle cases where k > arr.length
        if (k < 0) {
            k = arr.length + k; // Handle negative rotations
        }

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers greater than 5:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();  
              }

        System.out.println("Original array: " + Arrays.toString(arr));
        rotate(arr, k);
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}*/